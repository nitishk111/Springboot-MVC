<html>
	<head>
		<title></title>
	</head>
	<body>
		<h1>Here you will get Records of Captured Aliens like never before.</h1>
		

		
		<hr>
			
		<h3>Add Alien Record</h3>
		
		<form action="alien" method="Post">
					Enter Alien id: <input type="text" name="aId"><br/>	
					Enter Alien Name: <input type="text" name="aName"><br/>
					<input type="submit">
		</form><hr>
		
		<h3>Get all aliens</h3>		

	<form action="aliens" method="Get">
		<input type ="submit" value="All record">
	</form>
	
	<hr>
	<h3>Search Alien by id or name</h3>
	<form action="alien/name" method="Get">
					
						Name: <input type="text" name="aName">
						<input type="submit">
			</form>
			<form action="alien/id" method="Get">
									Id: <input type="text" name="aId">
									<input type="submit">
						</form>
	
	
	</body>
	
	
</html>