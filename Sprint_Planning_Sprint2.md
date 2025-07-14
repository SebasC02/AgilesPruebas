
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

> Comparar restaurantes y sugerir restaurantes por comida favorita.

---

## 4. Rango de Velocidades

- Velocidad baja: 10  
- Velocidad alta: 18  

---

## 5. Capacidad

| Integrante | Días trabajo | Días planificación | Horas/día | Esfuerzo estimado (h) |
|------------|--------------|---------------------|-----------|------------------------|
| Xavier     | 6            | 2                   | 4-5       | 16-20                  |
| Sebastián  | 6            | 2                   | 3-6       | 12-24                  |
| Brandon    | 6            | 2                   | 4-5       | 16-20                  |
| Bryan      | 6            | 2                   | 3-5       | 12-20                  |

**Total:** 56–84 horas

---

## 6. Sprint Backlog

| ID  | PBI                                    | Tamaño | Tareas                                                                                                      | Total horas |
|-----|-----------------------------------------|--------|-------------------------------------------------------------------------------------------------------------|-------------|
| 1   | Mejorar calificación                    | 5 SP   | Modificar SvDalificacion.java, CalificacionService.java, Calificacion.java, CalificacionDAO.java, calificarRestaurante.jsp, index.jsp, Svlndex.java | 19          |
| 2   | Comparar dos restaurantes               | 5 SP   | ComparacionService.java, SvComparar.java, compararRestaurantes.jsp, resultadoComparacion.jsp               | 11          |
| 3   | Restaurantes sugeridos por comida favorita | 5 SP | RecomendacionService.java, Modificar Svlndex.java, index.jsp                                                | 13          |
| 4   | Modificaciones planificación            | —      | SvPlanificacion.java, crearPlanificacion.jsp, PlanificacionService.java, Planificacion.java                 | 11          |

**Total:** 15 SP – 54 horas

---

## 7. Definition of Done

- [x] La calificación ahora comprende:  
- [x] La aplicación está desplegada en Azure.  
- [x] El comensal recibe una respuesta concreta en la comparación de dos restaurantes.  
- [x] El comensal puede elegir su tipo de comida favorita al registrarse.  
- [x] El comensal puede observar en el dashboard una sección con los restaurantes sugeridos de acuerdo con su comida favorita.  
- [x] La planificación ahora tiene un límite de comensales.
