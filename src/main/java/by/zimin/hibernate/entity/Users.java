package by.zimin.hibernate.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Users {
    private Long id;
    private Boolean archive;
    private String email;
    private String name;
    private String password;
    private String role;
    private Long bucketId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "archive", nullable = true)
    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "role", nullable = true, length = 255)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "bucket_id", nullable = true)
    public Long getBucketId() {
        return bucketId;
    }

    public void setBucketId(Long bucketId) {
        this.bucketId = bucketId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) && Objects.equals(archive, users.archive) && Objects.equals(email, users.email) && Objects.equals(name, users.name) && Objects.equals(password, users.password) && Objects.equals(role, users.role) && Objects.equals(bucketId, users.bucketId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, archive, email, name, password, role, bucketId);
    }
}
