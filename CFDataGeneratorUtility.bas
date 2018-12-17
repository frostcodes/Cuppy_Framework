﻿B4J=true
Group=Cuppy Framework\Cuppy\Utilities
ModulesStructureVersion=1
Type=StaticCode
Version=6.3
@EndOfDesignText@
'This contains functions that are useful for Generating Random Data
Private Sub Process_Globals
	Private fx As JFX
End Sub
 
 #Region rand_human_name : Generates a random real human name 
 
'Generates a random human name...
'List of Names is
'FROM: https://gist.github.com/subodhghulaxe/8148971
Public Sub Rand_Human_Name As String

	Dim names As List
	names.Initialize

	'Add list of names
 
	names.Add("Abbott")
	names.Add("Acevedo")
	names.Add("Acosta")
	names.Add("Adams")
	names.Add("Adkins")
	names.Add("Aguilar")
	names.Add("Aguirre")
	names.Add("Albert")
	names.Add("Alexander")
	names.Add("Alford")
	names.Add("Allen")
	names.Add("Allison")
	names.Add("Alston")
	names.Add("Alvarado")
	names.Add("Alvarez")
	names.Add("Anderson")
	names.Add("Andrews")
	names.Add("Anthony")
	names.Add("Armstrong")
	names.Add("Arnold")
	names.Add("Ashley")
	names.Add("Atkins")
	names.Add("Atkinson")
	names.Add("Austin")
	names.Add("Avery")
	names.Add("Avila")
	names.Add("Ayala")
	names.Add("Ayers")
	names.Add("Bailey")
	names.Add("Baird")
	names.Add("Baker")
	names.Add("Baldwin")
	names.Add("Ball")
	names.Add("Ballard")
	names.Add("Banks")
	names.Add("Barber")
	names.Add("Barker")
	names.Add("Barlow")
	names.Add("Barnes")
	names.Add("Barnett")
	names.Add("Barr")
	names.Add("Barrera")
	names.Add("Barrett")
	names.Add("Barron")
	names.Add("Barry")
	names.Add("Bartlett")
	names.Add("Barton")
	names.Add("Bass")
	names.Add("Bates")
	names.Add("Battle")
	names.Add("Bauer")
	names.Add("Baxter")
	names.Add("Beach")
	names.Add("Bean")
	names.Add("Beard")
	names.Add("Beasley")
	names.Add("Beck")
	names.Add("Becker")
	names.Add("Bell")
	names.Add("Bender")
	names.Add("Benjamin")
	names.Add("Bennett")
	names.Add("Benson")
	names.Add("Bentley")
	names.Add("Benton")
	names.Add("Berg")
	names.Add("Berger")
	names.Add("Bernard")
	names.Add("Berry")
	names.Add("Best")
	names.Add("Bird")
	names.Add("Bishop")
	names.Add("Black")
	names.Add("Blackburn")
	names.Add("Blackwell")
	names.Add("Blair")
	names.Add("Blake")
	names.Add("Blanchard")
	names.Add("Blankenship")
	names.Add("Blevins")
	names.Add("Bolton")
	names.Add("Bond")
	names.Add("Bonner")
	names.Add("Booker")
	names.Add("Boone")
	names.Add("Booth")
	names.Add("Bowen")
	names.Add("Bowers")
	names.Add("Bowman")
	names.Add("Boyd")
	names.Add("Boyer")
	names.Add("Boyle")
	names.Add("Bradford")
	names.Add("Bradley")
	names.Add("Bradshaw")
	names.Add("Brady")
	names.Add("Branch")
	names.Add("Bray")
	names.Add("Brennan")
	names.Add("Brewer")
	names.Add("Bridges")
	names.Add("Briggs")
	names.Add("Bright")
	names.Add("Britt")
	names.Add("Brock")
	names.Add("Brooks")
	names.Add("Brown")
	names.Add("Browning")
	names.Add("Bruce")
	names.Add("Bryan")
	names.Add("Bryant")
	names.Add("Buchanan")
	names.Add("Buck")
	names.Add("Buckley")
	names.Add("Buckner")
	names.Add("Bullock")
	names.Add("Burch")
	names.Add("Burgess")
	names.Add("Burke")
	names.Add("Burks")
	names.Add("Burnett")
	names.Add("Burns")
	names.Add("Burris")
	names.Add("Burt")
	names.Add("Burton")
	names.Add("Bush")
	names.Add("Butler")
	names.Add("Byers")
	names.Add("Byrd")
	names.Add("Cabrera")
	names.Add("Cain")
	names.Add("Calderon")
	names.Add("Caldwell")
	names.Add("Calhoun")
	names.Add("Callahan")
	names.Add("Camacho")
	names.Add("Cameron")
	names.Add("Campbell")
	names.Add("Campos")
	names.Add("Cannon")
	names.Add("Cantrell")
	names.Add("Cantu")
	names.Add("Cardenas")
	names.Add("Carey")
	names.Add("Carlson")
	names.Add("Carney")
	names.Add("Carpenter")
	names.Add("Carr")
	names.Add("Carrillo")
	names.Add("Carroll")
	names.Add("Carson")
	names.Add("Carter")
	names.Add("Carver")
	names.Add("Case")
	names.Add("Casey")
	names.Add("Cash")
	names.Add("Castaneda")
	names.Add("Castillo")
	names.Add("Castro")
	names.Add("Cervantes")
	names.Add("Chambers")
	names.Add("Chan")
	names.Add("Chandler")
	names.Add("Chaney")
	names.Add("Chang")
	names.Add("Chapman")
	names.Add("Charles")
	names.Add("Chase")
	names.Add("Chavez")
	names.Add("Chen")
	names.Add("Cherry")
	names.Add("Christensen")
	names.Add("Christian")
	names.Add("Church")
	names.Add("Clark")
	names.Add("Clarke")
	names.Add("Clay")
	names.Add("Clayton")
	names.Add("Clements")
	names.Add("Clemons")
	names.Add("Cleveland")
	names.Add("Cline")
	names.Add("Cobb")
	names.Add("Cochran")
	names.Add("Coffey")
	names.Add("Cohen")
	names.Add("Cole")
	names.Add("Coleman")
	names.Add("Collier")
	names.Add("Collins")
	names.Add("Colon")
	names.Add("Combs")
	names.Add("Compton")
	names.Add("Conley")
	names.Add("Conner")
	names.Add("Conrad")
	names.Add("Contreras")
	names.Add("Conway")
	names.Add("Cook")
	names.Add("Cooke")
	names.Add("Cooley")
	names.Add("Cooper")
	names.Add("Copeland")
	names.Add("Cortez")
	names.Add("Cote")
	names.Add("Cotton")
	names.Add("Cox")
	names.Add("Craft")
	names.Add("Craig")
	names.Add("Crane")
	names.Add("Crawford")
	names.Add("Crosby")
	names.Add("Cross")
	names.Add("Cruz")
	names.Add("Cummings")
	names.Add("Cunningham")
	names.Add("Curry")
	names.Add("Curtis")
	names.Add("Dale")
	names.Add("Dalton")
	names.Add("Daniel")
	names.Add("Daniels")
	names.Add("Daugherty")
	names.Add("Davenport")
	names.Add("David")
	names.Add("Davidson")
	names.Add("Davis")
	names.Add("Dawson")
	names.Add("Day")
	names.Add("Dean")
	names.Add("Decker")
	names.Add("Dejesus")
	names.Add("Delacruz")
	names.Add("Delaney")
	names.Add("Deleon")
	names.Add("Delgado")
	names.Add("Dennis")
	names.Add("Diaz")
	names.Add("Dickerson")
	names.Add("Dickson")
	names.Add("Dillard")
	names.Add("Dillon")
	names.Add("Dixon")
	names.Add("Dodson")
	names.Add("Dominguez")
	names.Add("Donaldson")
	names.Add("Donovan")
	names.Add("Dorsey")
	names.Add("Dotson")
	names.Add("Douglas")
	names.Add("Downs")
	names.Add("Doyle")
	names.Add("Drake")
	names.Add("Dudley")
	names.Add("Duffy")
	names.Add("Duke")
	names.Add("Duncan")
	names.Add("Dunlap")
	names.Add("Dunn")
	names.Add("Duran")
	names.Add("Durham")
	names.Add("Dyer")
	names.Add("Eaton")
	names.Add("Edwards")
	names.Add("Elliott")
	names.Add("Ellis")
	names.Add("Ellison")
	names.Add("Emerson")
	names.Add("England")
	names.Add("English")
	names.Add("Erickson")
	names.Add("Espinoza")
	names.Add("Estes")
	names.Add("Estrada")
	names.Add("Evans")
	names.Add("Everett")
	names.Add("Ewing")
	names.Add("Farley")
	names.Add("Farmer")
	names.Add("Farrell")
	names.Add("Faulkner")
	names.Add("Ferguson")
	names.Add("Fernandez")
	names.Add("Ferrell")
	names.Add("Fields")
	names.Add("Figueroa")
	names.Add("Finch")
	names.Add("Finley")
	names.Add("Fischer")
	names.Add("Fisher")
	names.Add("Fitzgerald")
	names.Add("Fitzpatrick")
	names.Add("Fleming")
	names.Add("Fletcher")
	names.Add("Flores")
	names.Add("Flowers")
	names.Add("Floyd")
	names.Add("Flynn")
	names.Add("Foley")
	names.Add("Forbes")
	names.Add("Ford")
	names.Add("Foreman")
	names.Add("Foster")
	names.Add("Fowler")
	names.Add("Fox")
	names.Add("Francis")
	names.Add("Franco")
	names.Add("Frank")
	names.Add("Franklin")
	names.Add("Franks")
	names.Add("Frazier")
	names.Add("Frederick")
	names.Add("Freeman")
	names.Add("French")
	names.Add("Frost")
	names.Add("Fry")
	names.Add("Frye")
	names.Add("Fuentes")
	names.Add("Fuller")
	names.Add("Fulton")
	names.Add("Gaines")
	names.Add("Gallagher")
	names.Add("Gallegos")
	names.Add("Galloway")
	names.Add("Gamble")
	names.Add("Garcia")
	names.Add("Gardner")
	names.Add("Garner")
	names.Add("Garrett")
	names.Add("Garrison")
	names.Add("Garza")
	names.Add("Gates")
	names.Add("Gay")
	names.Add("Gentry")
	names.Add("George")
	names.Add("Gibbs")
	names.Add("Gibson")
	names.Add("Gilbert")
	names.Add("Giles")
	names.Add("Gill")
	names.Add("Gillespie")
	names.Add("Gilliam")
	names.Add("Gilmore")
	names.Add("Glass")
	names.Add("Glenn")
	names.Add("Glover")
	names.Add("Goff")
	names.Add("Golden")
	names.Add("Gomez")
	names.Add("Gonzales")
	names.Add("Gonzalez")
	names.Add("Good")
	names.Add("Goodman")
	names.Add("Goodwin")
	names.Add("Gordon")
	names.Add("Gould")
	names.Add("Graham")
	names.Add("Grant")
	names.Add("Graves")
	names.Add("Gray")
	names.Add("Green")
	names.Add("Greene")
	names.Add("Greer")
	names.Add("Gregory")
	names.Add("Griffin")
	names.Add("Griffith")
	names.Add("Grimes")
	names.Add("Gross")
	names.Add("Guerra")
	names.Add("Guerrero")
	names.Add("Guthrie")
	names.Add("Gutierrez")
	names.Add("Guy")
	names.Add("Guzman")
	names.Add("Hahn")
	names.Add("Hale")
	names.Add("Haley")
	names.Add("Hall")
	names.Add("Hamilton")
	names.Add("Hammond")
	names.Add("Hampton")
	names.Add("Hancock")
	names.Add("Haney")
	names.Add("Hansen")
	names.Add("Hanson")
	names.Add("Hardin")
	names.Add("Harding")
	names.Add("Hardy")
	names.Add("Harmon")
	names.Add("Harper")
	names.Add("Harrell")
	names.Add("Harrington")
	names.Add("Harris")
	names.Add("Harrison")
	names.Add("Hart")
	names.Add("Hartman")
	names.Add("Harvey")
	names.Add("Hatfield")
	names.Add("Hawkins")
	names.Add("Hayden")
	names.Add("Hayes")
	names.Add("Haynes")
	names.Add("Hays")
	names.Add("Head")
	names.Add("Heath")
	names.Add("Hebert")
	names.Add("Henderson")
	names.Add("Hendricks")
	names.Add("Hendrix")
	names.Add("Henry")
	names.Add("Hensley")
	names.Add("Henson")
	names.Add("Herman")
	names.Add("Hernandez")
	names.Add("Herrera")
	names.Add("Herring")
	names.Add("Hess")
	names.Add("Hester")
	names.Add("Hewitt")
	names.Add("Hickman")
	names.Add("Hicks")
	names.Add("Higgins")
	names.Add("Hill")
	names.Add("Hines")
	names.Add("Hinton")
	names.Add("Hobbs")
	names.Add("Hodge")
	names.Add("Hodges")
	names.Add("Hoffman")
	names.Add("Hogan")
	names.Add("Holcomb")
	names.Add("Holden")
	names.Add("Holder")
	names.Add("Holland")
	names.Add("Holloway")
	names.Add("Holman")
	names.Add("Holmes")
	names.Add("Holt")
	names.Add("Hood")
	names.Add("Hooper")
	names.Add("Hoover")
	names.Add("Hopkins")
	names.Add("Hopper")
	names.Add("Horn")
	names.Add("Horne")
	names.Add("Horton")
	names.Add("House")
	names.Add("Houston")
	names.Add("Howard")
	names.Add("Howe")
	names.Add("Howell")
	names.Add("Hubbard")
	names.Add("Huber")
	names.Add("Hudson")
	names.Add("Huff")
	names.Add("Huffman")
	names.Add("Hughes")
	names.Add("Hull")
	names.Add("Humphrey")
	names.Add("Hunt")
	names.Add("Hunter")
	names.Add("Hurley")
	names.Add("Hurst")
	names.Add("Hutchinson")
	names.Add("Hyde")
	names.Add("Ingram")
	names.Add("Irwin")
	names.Add("Jackson")
	names.Add("Jacobs")
	names.Add("Jacobson")
	names.Add("James")
	names.Add("Jarvis")
	names.Add("Jefferson")
	names.Add("Jenkins")
	names.Add("Jennings")
	names.Add("Jensen")
	names.Add("Jimenez")
	names.Add("Johns")
	names.Add("Johnson")
	names.Add("Johnston")
	names.Add("Jones")
	names.Add("Jordan")
	names.Add("Joseph")
	names.Add("Joyce")
	names.Add("Joyner")
	names.Add("Juarez")
	names.Add("Justice")
	names.Add("Kane")
	names.Add("Kaufman")
	names.Add("Keith")
	names.Add("Keller")
	names.Add("Kelley")
	names.Add("Kelly")
	names.Add("Kemp")
	names.Add("Kennedy")
	names.Add("Kent")
	names.Add("Kerr")
	names.Add("Key")
	names.Add("Kidd")
	names.Add("Kim")
	names.Add("King")
	names.Add("Kinney")
	names.Add("Kirby")
	names.Add("Kirk")
	names.Add("Kirkland")
	names.Add("Klein")
	names.Add("Kline")
	names.Add("Knapp")
	names.Add("Knight")
	names.Add("Knowles")
	names.Add("Knox")
	names.Add("Koch")
	names.Add("Kramer")
	names.Add("Lamb")
	names.Add("Lambert")
	names.Add("Lancaster")
	names.Add("Landry")
	names.Add("Lane")
	names.Add("Lang")
	names.Add("Langley")
	names.Add("Lara")
	names.Add("Larsen")
	names.Add("Larson")
	names.Add("Lawrence")
	names.Add("Lawson")
	names.Add("Le")
	names.Add("Leach")
	names.Add("Leblanc")
	names.Add("Lee")
	names.Add("Leon")
	names.Add("Leonard")
	names.Add("Lester")
	names.Add("Levine")
	names.Add("Levy")
	names.Add("Lewis")
	names.Add("Lindsay")
	names.Add("Lindsey")
	names.Add("Little")
	names.Add("Livingston")
	names.Add("Lloyd")
	names.Add("Logan")
	names.Add("Long")
	names.Add("Lopez")
	names.Add("Lott")
	names.Add("Love")
	names.Add("Lowe")
	names.Add("Lowery")
	names.Add("Lucas")
	names.Add("Luna")
	names.Add("Lynch")
	names.Add("Lynn")
	names.Add("Lyons")
	names.Add("Macdonald")
	names.Add("Macias")
	names.Add("Mack")
	names.Add("Madden")
	names.Add("Maddox")
	names.Add("Maldonado")
	names.Add("Malone")
	names.Add("Mann")
	names.Add("Manning")
	names.Add("Marks")
	names.Add("Marquez")
	names.Add("Marsh")
	names.Add("Marshall")
	names.Add("Martin")
	names.Add("Martinez")
	names.Add("Mason")
	names.Add("Massey")
	names.Add("Mathews")
	names.Add("Mathis")
	names.Add("Matthews")
	names.Add("Maxwell")
	names.Add("May")
	names.Add("Mayer")
	names.Add("Maynard")
	names.Add("Mayo")
	names.Add("Mays")
	names.Add("Mcbride")
	names.Add("Mccall")
	names.Add("Mccarthy")
	names.Add("Mccarty")
	names.Add("Mcclain")
	names.Add("Mcclure")
	names.Add("Mcconnell")
	names.Add("Mccormick")
	names.Add("Mccoy")
	names.Add("Mccray")
	names.Add("Mccullough")
	names.Add("Mcdaniel")
	names.Add("Mcdonald")
	names.Add("Mcdowell")
	names.Add("Mcfadden")
	names.Add("Mcfarland")
	names.Add("Mcgee")
	names.Add("Mcgowan")
	names.Add("Mcguire")
	names.Add("Mcintosh")
	names.Add("Mcintyre")
	names.Add("Mckay")
	names.Add("Mckee")
	names.Add("Mckenzie")
	names.Add("Mckinney")
	names.Add("Mcknight")
	names.Add("Mclaughlin")
	names.Add("Mclean")
	names.Add("Mcleod")
	names.Add("Mcmahon")
	names.Add("Mcmillan")
	names.Add("Mcneil")
	names.Add("Mcpherson")
	names.Add("Meadows")
	names.Add("Medina")
	names.Add("Mejia")
	names.Add("Melendez")
	names.Add("Melton")
	names.Add("Mendez")
	names.Add("Mendoza")
	names.Add("Mercado")
	names.Add("Mercer")
	names.Add("Merrill")
	names.Add("Merritt")
	names.Add("Meyer")
	names.Add("Meyers")
	names.Add("Michael")
	names.Add("Middleton")
	names.Add("Miles")
	names.Add("Miller")
	names.Add("Mills")
	names.Add("Miranda")
	names.Add("Mitchell")
	names.Add("Molina")
	names.Add("Monroe")
	names.Add("Montgomery")
	names.Add("Montoya")
	names.Add("Moody")
	names.Add("Moon")
	names.Add("Mooney")
	names.Add("Moore")
	names.Add("Morales")
	names.Add("Moran")
	names.Add("Moreno")
	names.Add("Morgan")
	names.Add("Morin")
	names.Add("Morris")
	names.Add("Morrison")
	names.Add("Morrow")
	names.Add("Morse")
	names.Add("Morton")
	names.Add("Moses")
	names.Add("Mosley")
	names.Add("Moss")
	names.Add("Mueller")
	names.Add("Mullen")
	names.Add("Mullins")
	names.Add("Munoz")
	names.Add("Murphy")
	names.Add("Murray")
	names.Add("Myers")
	names.Add("Nash")
	names.Add("Navarro")
	names.Add("Neal")
	names.Add("Nelson")
	names.Add("Newman")
	names.Add("Newton")
	names.Add("Nguyen")
	names.Add("Nichols")
	names.Add("Nicholson")
	names.Add("Nielsen")
	names.Add("Nieves")
	names.Add("Nixon")
	names.Add("Noble")
	names.Add("Noel")
	names.Add("Nolan")
	names.Add("Norman")
	names.Add("Norris")
	names.Add("Norton")
	names.Add("Nunez")
	names.Add("Obrien")
	names.Add("Ochoa")
	names.Add("Oconnor")
	names.Add("Odom")
	names.Add("Odonnell")
	names.Add("Oliver")
	names.Add("Olsen")
	names.Add("Olson")
	names.Add("Oneal")
	names.Add("Oneil")
	names.Add("Oneill")
	names.Add("Orr")
	names.Add("Ortega")
	names.Add("Ortiz")
	names.Add("Osborn")
	names.Add("Osborne")
	names.Add("Owen")
	names.Add("Owens")
	names.Add("Pace")
	names.Add("Pacheco")
	names.Add("Padilla")
	names.Add("Page")
	names.Add("Palmer")
	names.Add("Park")
	names.Add("Parker")
	names.Add("Parks")
	names.Add("Parrish")
	names.Add("Parsons")
	names.Add("Pate")
	names.Add("Patel")
	names.Add("Patrick")
	names.Add("Patterson")
	names.Add("Patton")
	names.Add("Paul")
	names.Add("Payne")
	names.Add("Pearson")
	names.Add("Peck")
	names.Add("Pena")
	names.Add("Pennington")
	names.Add("Perez")
	names.Add("Perkins")
	names.Add("Perry")
	names.Add("Peters")
	names.Add("Petersen")
	names.Add("Peterson")
	names.Add("Petty")
	names.Add("Phelps")
	names.Add("Phillips")
	names.Add("Pickett")
	names.Add("Pierce")
	names.Add("Pittman")
	names.Add("Pitts")
	names.Add("Pollard")
	names.Add("Poole")
	names.Add("Pope")
	names.Add("Porter")
	names.Add("Potter")
	names.Add("Potts")
	names.Add("Powell")
	names.Add("Powers")
	names.Add("Pratt")
	names.Add("Preston")
	names.Add("Price")
	names.Add("Prince")
	names.Add("Pruitt")
	names.Add("Puckett")
	names.Add("Pugh")
	names.Add("Quinn")
	names.Add("Ramirez")
	names.Add("Ramos")
	names.Add("Ramsey")
	names.Add("Randall")
	names.Add("Randolph")
	names.Add("Rasmussen")
	names.Add("Ratliff")
	names.Add("Ray")
	names.Add("Raymond")
	names.Add("Reed")
	names.Add("Reese")
	names.Add("Reeves")
	names.Add("Reid")
	names.Add("Reilly")
	names.Add("Reyes")
	names.Add("Reynolds")
	names.Add("Rhodes")
	names.Add("Rice")
	names.Add("Rich")
	names.Add("Richard")
	names.Add("Richards")
	names.Add("Richardson")
	names.Add("Richmond")
	names.Add("Riddle")
	names.Add("Riggs")
	names.Add("Riley")
	names.Add("Rios")
	names.Add("Rivas")
	names.Add("Rivera")
	names.Add("Rivers")
	names.Add("Roach")
	names.Add("Robbins")
	names.Add("Roberson")
	names.Add("Roberts")
	names.Add("Robertson")
	names.Add("Robinson")
	names.Add("Robles")
	names.Add("Rocha")
	names.Add("Rodgers")
	names.Add("Rodriguez")
	names.Add("Rodriquez")
	names.Add("Rogers")
	names.Add("Rojas")
	names.Add("Rollins")
	names.Add("Roman")
	names.Add("Romero")
	names.Add("Rosa")
	names.Add("Rosales")
	names.Add("Rosario")
	names.Add("Rose")
	names.Add("Ross")
	names.Add("Roth")
	names.Add("Rowe")
	names.Add("Rowland")
	names.Add("Roy")
	names.Add("Ruiz")
	names.Add("Rush")
	names.Add("Russell")
	names.Add("Russo")
	names.Add("Rutledge")
	names.Add("Ryan")
	names.Add("Salas")
	names.Add("Salazar")
	names.Add("Salinas")
	names.Add("Sampson")
	names.Add("Sanchez")
	names.Add("Sanders")
	names.Add("Sandoval")
	names.Add("Sanford")
	names.Add("Santana")
	names.Add("Santiago")
	names.Add("Santos")
	names.Add("Sargent")
	names.Add("Saunders")
	names.Add("Savage")
	names.Add("Sawyer")
	names.Add("Schmidt")
	names.Add("Schneider")
	names.Add("Schroeder")
	names.Add("Schultz")
	names.Add("Schwartz")
	names.Add("Scott")
	names.Add("Sears")
	names.Add("Sellers")
	names.Add("Serrano")
	names.Add("Sexton")
	names.Add("Shaffer")
	names.Add("Shannon")
	names.Add("Sharp")
	names.Add("Sharpe")
	names.Add("Shaw")
	names.Add("Shelton")
	names.Add("Shepard")
	names.Add("Shepherd")
	names.Add("Sheppard")
	names.Add("Sherman")
	names.Add("Shields")
	names.Add("Short")
	names.Add("Silva")
	names.Add("Simmons")
	names.Add("Simon")
	names.Add("Simpson")
	names.Add("Sims")
	names.Add("Singleton")
	names.Add("Skinner")
	names.Add("Slater")
	names.Add("Sloan")
	names.Add("Small")
	names.Add("Smith")
	names.Add("Snider")
	names.Add("Snow")
	names.Add("Snyder")
	names.Add("Solis")
	names.Add("Solomon")
	names.Add("Sosa")
	names.Add("Soto")
	names.Add("Sparks")
	names.Add("Spears")
	names.Add("Spence")
	names.Add("Spencer")
	names.Add("Stafford")
	names.Add("Stanley")
	names.Add("Stanton")
	names.Add("Stark")
	names.Add("Steele")
	names.Add("Stein")
	names.Add("Stephens")
	names.Add("Stephenson")
	names.Add("Stevens")
	names.Add("Stevenson")
	names.Add("Stewart")
	names.Add("Stokes")
	names.Add("Stone")
	names.Add("Stout")
	names.Add("Strickland")
	names.Add("Strong")
	names.Add("Stuart")
	names.Add("Suarez")
	names.Add("Sullivan")
	names.Add("Summers")
	names.Add("Sutton")
	names.Add("Swanson")
	names.Add("Sweeney")
	names.Add("Sweet")
	names.Add("Sykes")
	names.Add("Talley")
	names.Add("Tanner")
	names.Add("Tate")
	names.Add("Taylor")
	names.Add("Terrell")
	names.Add("Terry")
	names.Add("Thomas")
	names.Add("Thompson")
	names.Add("Thornton")
	names.Add("Tillman")
	names.Add("Todd")
	names.Add("Torres")
	names.Add("Townsend")
	names.Add("Tran")
	names.Add("Travis")
	names.Add("Trevino")
	names.Add("Trujillo")
	names.Add("Tucker")
	names.Add("Turner")
	names.Add("Tyler")
	names.Add("Tyson")
	names.Add("Underwood")
	names.Add("Valdez")
	names.Add("Valencia")
	names.Add("Valentine")
	names.Add("Valenzuela")
	names.Add("Vance")
	names.Add("Vang")
	names.Add("Vargas")
	names.Add("Vasquez")
	names.Add("Vaughan")
	names.Add("Vaughn")
	names.Add("Vazquez")
	names.Add("Vega")
	names.Add("Velasquez")
	names.Add("Velazquez")
	names.Add("Velez")
	names.Add("Villarreal")
	names.Add("Vincent")
	names.Add("Vinson")
	names.Add("Wade")
	names.Add("Wagner")
	names.Add("Walker")
	names.Add("Wall")
	names.Add("Wallace")
	names.Add("Waller")
	names.Add("Walls")
	names.Add("Walsh")
	names.Add("Walter")
	names.Add("Walters")
	names.Add("Walton")
	names.Add("Ward")
	names.Add("Ware")
	names.Add("Warner")
	names.Add("Warren")
	names.Add("Washington")
	names.Add("Waters")
	names.Add("Watkins")
	names.Add("Watson")
	names.Add("Watts")
	names.Add("Weaver")
	names.Add("Webb")
	names.Add("Weber")
	names.Add("Webster")
	names.Add("Weeks")
	names.Add("Weiss")
	names.Add("Welch")
	names.Add("Wells")
	names.Add("West")
	names.Add("Wheeler")
	names.Add("Whitaker")
	names.Add("White")
	names.Add("Whitehead")
	names.Add("Whitfield")
	names.Add("Whitley")
	names.Add("Whitney")
	names.Add("Wiggins")
	names.Add("Wilcox")
	names.Add("Wilder")
	names.Add("Wiley")
	names.Add("Wilkerson")
	names.Add("Wilkins")
	names.Add("Wilkinson")
	names.Add("William")
	names.Add("Williams")
	names.Add("Williamson")
	names.Add("Willis")
	names.Add("Wilson")
	names.Add("Winters")
	names.Add("Wise")
	names.Add("Witt")
	names.Add("Wolf")
	names.Add("Wolfe")
	names.Add("Wong")
	names.Add("Wood")
	names.Add("Woodard")
	names.Add("Woods")
	names.Add("Woodward")
	names.Add("Wooten")
	names.Add("Workman")
	names.Add("Wright")
	names.Add("Wyatt")
	names.Add("Wynn")
	names.Add("Yang")
	names.Add("Yates")
	names.Add("York")
	names.Add("Young")
	names.Add("Zamora")
	names.Add("Zimmerman")
 
	Return CFStringUtility.RandListValue(names)
 
End Sub

'Generates a random human full name
Public Sub Rand_Full_Name As String
	
	Return Rand_Human_Name & " " & Rand_Human_Name
	
End Sub

 #End Region

#Region Human Gender

'Generates a random human Gender and Types
'between MALE or FEMALE only!
Public Sub Rand_Gender As String
	
	Dim Genders As List
	Genders.Initialize
	
	'Because List contains 2 items, seedling is poor so we repeat list to improve seedling/randomness
	Genders.Add("Male")
	Genders.Add("Female")
	Genders.Add("Male")
	
	Genders.Add("Female")
	Genders.Add("Female")
	Genders.Add("Male")
	
	Genders.Add("Male")
	Genders.Add("Male")
	Genders.Add("Female")
	
	Genders.Add("Female")
	Genders.Add("Male")
	Genders.Add("Female")

Return CFStringUtility.RandListValue(Genders)
	
End Sub

#Region GenderTypesList: A Full list of Gender Types

'Returns a List of the Most accepted Genders in the world
'This list does not contain MALE or FEMALE just Gender Types
'FROM: http://genderfluidsupport.tumblr.com/gender
Public Sub GenderTypesList As List
	
	Dim GenderTypes As List
	GenderTypes.Initialize
	
	GenderTypes.Add("Abimegender")
	GenderTypes.Add("Adamasgender")
	GenderTypes.Add("Aerogender")
	GenderTypes.Add("Aesthetigender")
	GenderTypes.Add("Affectugender")
	GenderTypes.Add("Agender")
	GenderTypes.Add("Agenderflux")

	GenderTypes.Add("Alexigender")
	GenderTypes.Add("Aliusgender")
	GenderTypes.Add("Amaregender")
	GenderTypes.Add("Ambigender")
	GenderTypes.Add("Ambonec")
	GenderTypes.Add("Amicagender")
	GenderTypes.Add("Androgyne")
	GenderTypes.Add("Anesigender")

	GenderTypes.Add("Angenital")
	GenderTypes.Add("Anogender")
	GenderTypes.Add("Anongender")
	GenderTypes.Add("Antegender")
	GenderTypes.Add("Anxiegender")
	GenderTypes.Add("Apagender")
	GenderTypes.Add("Apconsugender")
	GenderTypes.Add("Astergender")
	GenderTypes.Add("Astralgender")

	GenderTypes.Add("Autigender")
	GenderTypes.Add("Autogender")
	GenderTypes.Add("Axigender")
	GenderTypes.Add("Bigender")
	GenderTypes.Add("Biogender")
	GenderTypes.Add("Blurgender")
	GenderTypes.Add("Boyflux")
	GenderTypes.Add("Burstgender")
	GenderTypes.Add("Caelgender")

	GenderTypes.Add("Cassgender")
	GenderTypes.Add("Cassflux")
	GenderTypes.Add("Cavusgender")
	GenderTypes.Add("Cendgender")
	GenderTypes.Add("Ceterofluid")
	GenderTypes.Add("Ceterogender")
	GenderTypes.Add("Cisgender")
	GenderTypes.Add("Cloudgender")
	GenderTypes.Add("Collgender")

	GenderTypes.Add("Colorgender")
	GenderTypes.Add("Commogender")
	GenderTypes.Add("Condigender")
	GenderTypes.Add("Deliciagender")
	GenderTypes.Add("Demifluid")
	GenderTypes.Add("Demiflux")
	GenderTypes.Add("Demigender")
	GenderTypes.Add("Domgender")
	GenderTypes.Add("Demi-vapor")

	GenderTypes.Add("Demi-smoke")
	GenderTypes.Add("Duragender")
	GenderTypes.Add("Egogender")
	GenderTypes.Add("Epicene")
	GenderTypes.Add("Espigender")
	GenderTypes.Add("Exgender")
	GenderTypes.Add("Existigender")

	GenderTypes.Add("Female")
	GenderTypes.Add("Femfluid")
	GenderTypes.Add("Femgender")
	GenderTypes.Add("Fluidflux")
	GenderTypes.Add("Gemigender")
	GenderTypes.Add("Genderblank")
	GenderTypes.Add("Genderflow")
	GenderTypes.Add("Genderfluid")

	GenderTypes.Add("Genderflux")
	GenderTypes.Add("Genderfuzz")
	GenderTypes.Add("Gender Neutral")
	GenderTypes.Add("Genderpunk")
	GenderTypes.Add("Genderqueer")
	GenderTypes.Add("Genderwitched")
	GenderTypes.Add("Girlflux")
	GenderTypes.Add("Glassgender")

	GenderTypes.Add("Glimragender")
	GenderTypes.Add("Greygender")
	GenderTypes.Add("Gyragender")
	GenderTypes.Add("Healgender")
	GenderTypes.Add("Heliogender")
	GenderTypes.Add("Hemigender")
	GenderTypes.Add("Horogender")
	GenderTypes.Add("Hydrogender")

	GenderTypes.Add("Imperigender")
	GenderTypes.Add("Intergender")
	GenderTypes.Add("Juxera")
	GenderTypes.Add("Libragender")
	GenderTypes.Add("Male")
	GenderTypes.Add("Magigender")
	GenderTypes.Add("Mascfluid")
	GenderTypes.Add("Mascgender")

	GenderTypes.Add("Maverique")
	GenderTypes.Add("Mirrorgender")
	GenderTypes.Add("Molligender")
	GenderTypes.Add("Multigender")
	GenderTypes.Add("Nanogender")
	GenderTypes.Add("Neutrois")
	GenderTypes.Add("Nonbinary")

	GenderTypes.Add("Omnigender")
	GenderTypes.Add("Oneirogender")
	GenderTypes.Add("Pangender")
	GenderTypes.Add("Paragender")
	GenderTypes.Add("Perigender")
	GenderTypes.Add("Polygender")
	GenderTypes.Add("Proxvir")

	GenderTypes.Add("Quoigender")
	GenderTypes.Add("Subgender")
	GenderTypes.Add("Surgender")
	GenderTypes.Add("Systemgender")
	GenderTypes.Add("Tragender")
	GenderTypes.Add("Transgender")
	GenderTypes.Add("Transneutral")

	GenderTypes.Add("Trigender")
	GenderTypes.Add("Vapogender")
	GenderTypes.Add("Venngender")
	GenderTypes.Add("Verangender")
	GenderTypes.Add("Vibragender")
	GenderTypes.Add("Vocigender")
	
	Return GenderTypes
	 
End Sub

#End Region
 
'Generates a random Gender Type 
'Refer to fullGenderTypesList() 
Public Sub Rand_Gender_Type As String
	 
	Return CFStringUtility.RandListValue(GenderTypesList)
	
End Sub

 #End Region

#Region Random Dummy Text
'Generates a random lorem ispum text
'ParagraphCount =   Is the number of paragraphs to generate
Public Sub Rand_Lorem_Ispum(ParagraphCount  As Int) As String

	Dim textList As List
	textList.Initialize
 
	textList.Add("Lorem ispum is the beginning of the random text.")

	textList.Add($"If Lorem Ispum was to be a paragraph,
    it would look like this."$)

	textList.Add($"I love Lorem Ispum because it is not an english word
   but a word used in another language."$)

	textList.Add($"Lorem Ispum is great also but programmers
    use it is to fill in for a test paragraph."$)

	textList.Add($"Once tried to understand what is Lorem Ispum,
   well you can google it is it a non-english word."$)

	textList.Add($"Lorem Ispum again and again and again,
  it would always be Lorem ispum, Thats all for now!"$)

	textList.Add($"Lorem Ispum was like the story of a man and a woman
   that fell in love even though it was not real love!"$)
     
	Dim st As StringBuilder
	st.Initialize
  
	For i = 1 To ParagraphCount
 
		st.Append(CFStringUtility.RandListValue(textList) & " ")
 
	Next
  
	Return st.ToString

End Sub

'Generates a random dummy text (lorem ispum)
'ParagraphCount =   Is the number of paragraphs to generate
'Alias of lorem_ispum()
Public Sub Rand_Dummy_Text(ParagraphCount  As Int) As String
 
 Return Rand_Lorem_Ispum(ParagraphCount)
 
End Sub
 
 #End Region
 
 #Region Random Email Generators
 'Generates a random email
Public Sub Rand_Email(EmailProvider As String, withNumeric As Boolean) As String
	 
	Dim name As String = Rand_Human_Name & Rand_Human_Name
	name = name.ToLowerCase
	
	 If withNumeric Then
	 	
		Return  name & "_" & Rnd(10, 3000) & "@" & EmailProvider
		
		Else
			
		Return name & "@" & EmailProvider
			
	End If
	
End Sub

'Generates a random Gmail address
'withNumeric = should gmail contain suffixed numbers
'EG demo_20@gmail.com
'Quick shortcut Alias of rand_email()
Public Sub Rand_Gmail(withNumeric As Boolean) As String
	 
	Return Rand_Email("gmail.com", withNumeric)
	
End Sub

'Generates a random Yahoo email address
'withNumeric = should gmail contain suffixed numbers
'EG demo_20@yahoo.com
'Quick shortcut Alias of rand_email()
Public Sub Rand_Yahoo_Mail(withNumeric As Boolean) As String
	 
	Return Rand_Email("yahoo.com", withNumeric)
	
End Sub

#End Region 

#Region Random phone number
'Generates a random phone number
'CountryCode = the Country Code to use without the + ; for example,
'Nigeria is 234, USA is 1 and Indian is 91
'length = This is how long should the remaining part of the number be
Public Sub Rand_Phone_Number(CountryCode As Int , length As Int) As String
	
	Return "+" & CountryCode & CFStringUtility.generatePinCode(length)
	 
End Sub
 
'Generates a random phone number
'CountryCode = the Country Code to use without the + ; for example,
'Nigeria is 234, USA is 1 and Indian is 91
'startsWith = what custom number should phone number start with?
'length = This is how long should the remaining part of the number be
'<code> 'Example: would output something like; +2348174795280
'log(CF_DataGeneratorUtility.rand_phoneNumber2(234, 817, 7))
'</code>
Public Sub Rand_Phone_Number2(CountryCode As Int , startsWith As Int, length As Int) As String
	
	Return "+" & CountryCode & startsWith & CFStringUtility.generatePinCode(length)
	 
End Sub

#End Region

#Region Random True or False Value 

'Generates a random True or False Value
Public Sub Rand_True_Or_False As Boolean
	 
	If Rnd( Rnd(1, 5), Rnd(6, 10))  < 6 Then
		
		Return True
		
		Else
			
		Return False
			
	End If
	 
End Sub

'Generates a random True or False Value
'Alias of Rand_True_Or_False()
Public Sub Rand_Boolean_Value As Boolean
	 
	Return Rand_True_Or_False
	 
End Sub

#End Region
 
'Generates a random IP address
Public Sub Rand_Ip_Address As String
	 
	Return  Rnd(190, 230) & "." & Rnd(13, 200) & "." & Rnd(50, 200) & "." & Rnd(75, 200)
	
End Sub

#Region Sports Data Generators

'List of Major Sports around the world
'NOTE: this list is not A-Z of all sports
Public Sub MajorSportsList As List
	
	Dim sports As List
	sports.Initialize
	
	sports.add("Alpine Skiing")
	sports.add("Athletics")
	sports.add("Badminton")
	sports.add("Basketball")
	sports.add("Bocce")
	sports.add("Bowling")

	sports.add("Cricket")
	sports.add("Cross Country Skiing")
	sports.add("Cycling")
	sports.add("Equestrian")
	sports.add("Figure Skating")
	sports.add("Floorball")

	sports.add("Floor Hockey")
	sports.add("Football")
	sports.add("Golf")
	sports.add("Gymnastics Artistic")
	sports.add("Gymnastics Rhythmic")
	sports.add("Handball")

	sports.add("Judo")
	sports.add("Kayaking")
	sports.add("Motor Activity Training Program")
	sports.add("Netball")
	sports.add("Open Water Swimming")
	sports.add("Powerlifting")
	sports.add("Roller Skating")

	sports.add("Sailing")
	sports.add("Short Track Speed Skating")
	sports.add("Snowboarding")
	sports.add("Snowshoeing")
 
	sports.add("Softball")
	sports.add("Swimming")
	sports.add("Table Tennis")
	sports.add("Tennis")
	sports.add("Triathlon")
	sports.add("Volleyball")

	Return sports
	
End Sub

'Generates a random sport name
Public Sub Rand_Sport_Name() As String
	
	Return CFStringUtility.RandListValue(MajorSportsList)
	
End Sub

#End Region
 
'Generates a random home address
'using a street address format
Public Sub Rand_Home_Address As String
	 
	Return  $"${Rnd(1, 999)} ${Rand_Human_Name} Street"$
	
End Sub

'Generates a random home address
'using an Estate house address format
Public Sub Rand_Home_Address2 As String
	 
	Return  $"Block ${Rnd(1, 130)} flat ${Rnd(1, 10)}, ${Rand_Human_Name} Estate"$
	
End Sub
  
'Generates a random company name
Public Sub Rand_Company_Name As String
	 
	Dim values As List
	values.Initialize
	
	values.AddAll(Array("Technologies", "& Sons","Clothings","Softwares","Enterprises"))
	values.AddAll(Array("Industries","System","Inc","Motors","& Co.", "Foods","Properties"))
	values.AddAll(Array("Brands","Digital","Logistics","Holdings","Labs"))
	
	Return  Rand_Human_Name & " " & CFStringUtility.RandListValue(values)
	
End Sub
 
'Generates a random job Occupation
Public Sub Rand_Occupation As String
	 
	Dim values As List
	values.Initialize
	
	values.AddAll(Array("Cleaner", "Make-up artist","Cashier","Banker","Manager"))
	values.AddAll(Array("Dentist","Doctor","Teacher","Web Developer","Lawyer", "Assistant","Sales man"))
	values.AddAll(Array("Graphics Designer","Digital Marketer","Musician","Blogger","Bartender"))
	
	Return CFStringUtility.RandListValue(values)
	
End Sub

'Generates a random job title
Public Sub Rand_Job_Title As String
	  
	Return Rand_Occupation

End Sub
  
	