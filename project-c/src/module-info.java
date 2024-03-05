module lk.ijse.dep12.project_c {
    requires transitive lk.ijse.dep12.project_b;
    requires lk.ijse.dep12.project_e;
    requires lk.ijse.dep12.project_f;
    exports lk.ijse.dep12.project_c.repo;
}