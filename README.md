# Practica-mvc

classDiagram
class Estudiantes {
    +int id_estudiante
    +string Nombre
    + string Apellido
    + string Email
}
class Docente{
    +int  id_Docente
    + string Nombre
    + string Especialidad
}
class Materia{
    +int id_Materia
    + string Nombre_Materia
    + int Creditos

}
class Grupo{
    +int id_grupo
    +int id_Docente
    +int id_Materia
    +string aula
    +string horario
