
# Documento de Visión

**Metodologías Ágiles**  
**Práctica 4 – Grupo 1**

**Integrantes:**
- Correa Sebastián  
- Coello Xavier  
- Guano Bryan  
- Jaya Brandon  

---

## 1. Contenido

1. CONTENIDO  
2. PRODUCT BACKLOG  
3. VELOCIDAD  
4. DURACIÓN DEL RELEASE

---

## 2. Product Backlog - DoR

| ID  | PBI                                               | Tamaño |
|-----|----------------------------------------------------|--------|
| 1   | Calificar restaurantes                             | 5 SP   |
| 2   | Votar calificaciones                               | 5 SP   |
| 3   | Ver comentarios de otras calificaciones            | 3 SP   |
| 4   | Planificar comidas grupales                        | 3 SP   |
| 5   | Mejorar calificaciones                             | 5 SP   |
| 6   | Comparar dos restaurantes                          | 8 SP   |
| 7   | Restaurantes sugeridos por comida favorita         | 5 SP   |
| 8   | Aumentar el número de restaurantes a comparar      | 3 SP   |
| 9   | Búsqueda por filtros                               | 2 SP   |
| 10  | Publicación de menús                               | 5 SP   |
| 11  | Guardar preferencias recientes                     | 3 SP   |
| 12  | Recomendaciones personalizadas                     | M      |
| 13  | Subir multimedia a las historias                   | X      |
| 14  | Ubicación de restaurantes en un mapa               | M      |
| 15  | Direcciones en tiempo real                         | S      |

---

### 2.1. Definition of Ready

- [x] La historia de usuario está redactada de forma clara y sin ambigüedades.  
- [x] Incluye criterios de aceptación con formato Dado-Cuando-Entonces.  
- [x] Se ha revisado con el equipo Scrum.  
- [x] Está estimada y adecuada para un sprint.  
- [x] No depende (o depende poco) de otras historias.  
- [x] Aporta valor al producto o al objetivo estratégico.  

---

## 3. Sprint Goal

> Calificar restaurantes y planificaciones grupales.

---

## 4. Rango de Velocidades

- Velocidad baja: 10  
- Velocidad alta: 18  

---

## 5. Capacidad

| Integrante | Días trabajo | Días planificación | Horas/día | Esfuerzo estimado (h) |
|------------|--------------|---------------------|-----------|------------------------|
| Xavier     | 5            | 2                   | 3-4       | 9-12                   |
| Sebastián  | 6            | 2                   | 4-6       | 16-24                  |
| Brandon    | 5            | 2                   | 4-5       | 12-15                  |
| Bryan      | 6            | 2                   | 4-5       | 16-20                  |

**Total:** 53–71 horas

---

## 6. Sprint Backlog

| ID  | PBI                                 | Tamaño | Tareas                                                                                     | Total horas |
|-----|--------------------------------------|--------|---------------------------------------------------------------------------------------------|-------------|
| 1   | Calificar restaurantes               | 5 SP   | calificarRestaurante.jsp, Calificacion.java, CalificacionService.java, SvCalificacion.java, CalificacionDAO.java, RestauranteDTO.java | 18          |
| 2   | Votar calificaciones                 | 5 SP   | detalleRestaurante.jsp, VotacionService.java, SvVotarCalificacion.java, VotoCalificacion.java, Modificar CalificacionDAO.java        | 15          |
| 3   | Ver comentarios de otras calificaciones | 3 SP | SvDetalleRestaurante.java, detalleRestaurante.jsp                                            | 5           |
| 4   | Planificar comidas grupales         | 3 SP   | PlanificacionDAO.java, Planificacion.java, PlanificacionService.java, SvPlanificacion.java, misPlanificacion.jsp                     | 22          |

**Total:** 16 SP – 60 horas

---

## 7. Definition of Done

- [x] Comensal puede calificar un restaurante.  
- [x] Comensal puede votar una calificación.  
- [x] Solo se permite una calificación por restaurante por usuario.  
- [x] Una nueva calificación reemplaza la anterior.  
- [x] Planificación acepta más de 2 comensales y restaurantes.  
- [x] Comensales pueden votar en la planificación.
