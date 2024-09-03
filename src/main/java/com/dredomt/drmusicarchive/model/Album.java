package com.dredomt.drmusicarchive.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.UUID;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "band_id", nullable = false)
    private Band band;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private int year;
    @Column(name = "cover_url", nullable = false)
    private String coverUrl;
    @Column(name = "youtube_link", nullable = false)
    private String youtubeLink;
    @Column(name = "official_site_link", nullable = false)
    private String officialSiteLink;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String info;
    @Column(name = "admin_recommendation", nullable = false)
    private boolean adminRecommendation;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
