package com.example.laboratorio05.data

import com.example.laboratorio05.data.model.MovieModel

val name = "Star Wars: episodio IV - una nueva esperanza"
val category = "Fiction"
val description = "La nave en la que viaja la princesa Leia es capturada por las tropas imperiales al mando del temible Darth Vader. Antes de ser atrapada, Leia consigue introducir un mensaje en su robot R2-D2, quien acompañado de su inseparable C-3PO logra escapar."
val qualification = "8.6"

val name2 = "El imperio contraataca"
val category2 = "Fiction"
val description2 = "Aunque la Estrella de la Muerte ha sido destruida, las tropas imperiales han hecho salir a las fuerzas rebeldes de sus bases ocultas y los persiguen a través de la galaxia. Mientras, el grupo de rebeldes de Skywalker se esconde en un planeta helado."
val qualification2 = "8.7"



var movies = mutableListOf(
    MovieModel(name, category, description, qualification),
    MovieModel(name2, category2, description2, qualification2)

)