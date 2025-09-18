package com.example.proj.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "atms")
@Data
@NoArgsConstructor
public class ATMEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atm_id")
    private Integer atmId;

    @Column(name = "location")
    private String location;

    // Many ATMs belong to one BankServer
    @ManyToOne
    @JoinColumn(name = "server_id")
    private BankserverEntity bankServer;
}
