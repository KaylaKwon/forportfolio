<%@ page contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<%@ page language="java" import="java.util.*, java.sql.*, javax.servlet.http.*" %>
<%!
	Connection DB_Connection() throws ClassNotFoundException, SQLException, Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection

("jdbc:mysql://localhost:3306/shoppingmalldb", "root", "root");
		return conn;
} 
	
	String TO_DB( String str ) throws Exception
	{
		if( str == null ) 
			return null;
		return new String( str.getBytes( "8859_1" ), "euc-kr" );
	}
%>

<%
	Connection conn = DB_Connection();
	Statement stmt = null;
	ResultSet rs = null;

	Integer productNumber = 0;
	String productName = null;
	Integer catgryNumber = 0;
	Integer productPrice = 0;
	String productImage = null;

	String str_c_page = request.getParameter( "str_c_page" );
	if( str_c_page == null ) 
		str_c_page = "1";
	int c_page = Integer.parseInt( str_c_page );

	int total_cnt = 0;
	int list_num = 10;
	int start = 0;
	int t_page = 0;

	String dbsearch = request.getParameter( "dbsearch" );
	if( dbsearch == null || dbsearch.trim( ).length( ) == 0 )
		dbsearch = "%";
	
	try
	{
		String sql_n = "select count(*) from Product ";
		sql_n += "where catgryNumber like '%" + dbsearch + "%'";

		stmt = conn.createStatement();
		rs = stmt.executeQuery( sql_n );

		if( rs.next() )
			total_cnt = rs.getInt(1);

		start = total_cnt - ( c_page - 1 ) * list_num;
		
%>

<html>
<head>
<title>뷰티인사이드</title>
</head>
	<table>
	
	<tr ><h1><p align=center><a href="board_list.jsp">Beauty inside</h1></tr>
	<table style = "width : 100%"><tr bgcolor="#CE9999"> 
<%
rs = stmt.executeQuery("select * from Category;");
while(rs.next()){
	Integer catgryNumber1 = rs.getInt("catgryNumber");
	String catgryName = rs.getString("catgryName");
%>
	<td><a href="board_list.jsp?dbsearch=<%=catgryNumber1%>"><%=catgryName%></td>
<%
	}
%></tr></table>
	<tr><td> 총 게시물수: <%=total_cnt%></td><td><p align=right>페이지:<%=c_page%> </td></tr>
	<table><tr>
<%
rs = stmt.executeQuery("select * from Product where catgryNumber like '%" + dbsearch + "%'");
int title_len = 100;
int aid = start;
int cnt = 0;

while( rs.next() )
{
	productNumber = rs.getInt("productNumber");
	productName = rs.getString("productName");
	catgryNumber = rs.getInt("catgryNumber");
	productPrice = rs.getInt("productPrice");
	productImage = rs.getString("productImage");
	aid--;
	cnt++;
%>
	<td><p align=center><a href = "<%=productImage%>.jsp">
	<img src="<%=productImage%>" width="250px" height="400px"><%=productName%></a></p></td>
<% 
	if((cnt % 5) == 0){
		%></tr><tr><%
		cnt = 0;
	}
		
	}
	stmt.close();
	rs.close();
}
catch( Exception e ) 
{
	out.println( e.toString() );
}
%>	</tr></table>
<%
	if( ( total_cnt % list_num ) == 0 )
		t_page = total_cnt / list_num;
	else
		t_page = ( total_cnt / list_num ) + 1;

	int block_num = 5;
	int t_block = t_page / block_num;

	if( t_page % block_num != 0 ) 
		t_block++;
	
	int c_block = c_page / block_num;
	
	if( c_page % block_num != 0 )
		c_block++;
%>
	<tr height = "5%"><td><p align=center>
<%
	for( int i=(c_block-1)*block_num+1; i<=c_block*block_num && i<=t_page; i++ ) 
	{ 
%>
	<a href="board_list.jsp?str_c_page=<%=i%>">
<% 
	if( c_page == i ) 
		out.print( "<b>" );
%>
	[<%=i%>]
<% 
	if( c_page == i ) 
		out.print( "</b>" );
%>
<%
	} 
%>
	</td></tr>
</table>

</html>