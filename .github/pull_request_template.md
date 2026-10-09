### Description
Implements the Task domain foundation for Sprint 1, including:
- `Task` entity with JPA annotations and automatic audit timestamps (`createdAt`, `updatedAt`).
- `TaskRepository` interface extending `JpaRepository`.
- `TaskService` business logic layer.
- `TaskController` exposing `POST /api/tasks` and `GET /api/tasks` endpoints.
- JUnit 5 & Mockito unit tests (`TaskServiceTest`).

### Related Issue
<!-- Leave empty or link if you created an issue -->

### Type of Change
- [x] New Feature (Task Domain / User Domain)
- [ ] Bug Fix
- [x] Refactoring / Test addition

### Reviewer Checklist
- [x] Code quality, readability, and naming conventions are clean.
- [x] Appropriate error handling is implemented.
- [x] Unit/Integration tests are added and passing.
- [ ] No self-approval (Must be reviewed and approved by the other developer).