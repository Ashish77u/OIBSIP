package com.library.librarymanagementsystem.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "issue_records")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IssueRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate; // null while still issued

    @Builder.Default
    private Double fineAmount = 0.0;

    @Builder.Default
    private Boolean finePaid = false;
}