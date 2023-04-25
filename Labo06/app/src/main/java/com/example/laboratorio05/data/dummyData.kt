package com.example.laboratorio05.data

val name = "Star Wars: episodio IV - una nueva esperanza"
val category = "Fiction"
val description = "La nave en la que viaja la princesa Leia es capturada por las tropas imperiales al mando del temible Darth Vader. Antes de ser atrapada, Leia consigue introducir un mensaje en su robot R2-D2, quien acompañado de su inseparable C-3PO logra escapar."
val qualification = "8.6"
val image = "drawable/ibai.jpg"

val name2 = "El imperio contraataca"
val category2 = "Fiction"
val description2 = "Aunque la Estrella de la Muerte ha sido destruida, las tropas imperiales han hecho salir a las fuerzas rebeldes de sus bases ocultas y los persiguen a través de la galaxia. Mientras, el grupo de rebeldes de Skywalker se esconde en un planeta helado."
val qualification2 = "8.7"
val image2 = "drawable/ibai.jpg"

val name3 = "Star Wars: episodio VI - el retorno del Jedi"
val category3 = "Fiction"
val description3 = "Luke Skywalker, ahora un experimentado caballero Jedi, intenta descubrir la identidad de Darth Vader."
val qualification3 = "8.3"
val image3 = "drawable/ibai.jpg"

var movies = mutableListOf(
    MovieModel(name, category, description, qualification, image),
    MovieModel(name2, category2, description2, qualification2, image2),
    MovieModel(name3, category3, description3, qualification3, image3),
)