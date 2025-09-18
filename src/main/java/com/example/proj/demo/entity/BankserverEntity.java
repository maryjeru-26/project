package com.example.proj.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "bank_servers")
@Data
@NoArgsConstructor
public class BankserverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "server_id")
    private int serverId;

    @Column(name = "status")
    private String status;

    // One BankServer manages many ATMs
    @OneToMany(mappedBy = "bankServer")
    private List<ATMEntity> atms;
}
