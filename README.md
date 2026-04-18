# Diagrama del ecosistema
```mermaid
classDiagram 

class Estudiantes {
    
    +int id_estudiante
    +string Nombre
    + string Apellido
    + string Email
}

class Docente {

    +int  id_docente
    + string Nombre
    + string Especialidad
}

class Materia {
    
    +int id_materia
    + string Nombre_Materia
    + int Creditos

}
class Grupo {
    
    +int id_grupo
    +int id_docente
    +int id_materia
    +string aula
    +string horario
}

class Inscripcion_Curso {

    +int id_inscripcion
    +int id_estudiante
    +int id_grupo
    +float nota_final
    +string estado
}

Estudiante "1" -- "*" Inscripcion_Curso : se inscribe
    Grupo "1" -- "*" Inscripcion_Curso : contiene alumnos
    Materia "1" -- "*" Grupo : se dicta en
    Docente "1" -- "*" Grupo : imparte
```