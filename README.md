# Practica-mvc
graph TD
    subgraph Presentation
        V[VistaEstudiante]
    end
    
    subgraph Controller
        C[ControladorEstudiante]
    end
    
    subgraph Service
        S[EstudianteService]
    end
    
    subgraph Data Access
        D[EstudianteDao]
    end
    
    subgraph Model
        M[Estudiantes]
    end
    
    subgraph Database
        DB[(PostgreSQL)]
        CP[ConexionPostgresDatabase]
    end
    
    V --> C
    C --> S
    S --> D
    D --> M
    D --> CP
    CP --> DB
    
    style V fill:#e1f5fe
    style C fill:#fff3e0
    style S fill:#e8f5e9
    style D fill:#fce4ec
    style M fill:#f3e5f5
    style DB fill:#eceff1
    style CP fill:#eceff1