-- Populate Users
INSERT INTO users (id, username, password, email, role, created_at, updated_at)
VALUES
  (gen_random_uuid(), 'admin', 'admin_password', 'admin@example.com', 'ADMIN', now(), now()),
  (gen_random_uuid(), 'user1', 'user1_password', 'user1@example.com', 'USER', now(), now());

-- Populate Bands
INSERT INTO bands (id, name, country, formed_in, status, created_at, updated_at)
VALUES
  (gen_random_uuid(), 'Nirvana', 'USA', 1987, 'Active', now(), now()),
  (gen_random_uuid(), 'Metallica', 'USA', 1981, 'Active', now(), now()),
  (gen_random_uuid(), 'Linkin Park', 'USA', 1996, 'Disbanded', now(), now());

-- Populate Albums
INSERT INTO albums (id, title, band_id, genre, year, cover_url, youtube_link, official_site_link, info, admin_recommendation, created_at, updated_at)
VALUES
  (gen_random_uuid(), 'Nevermind', (SELECT id FROM bands WHERE name = 'Nirvana'), 'Grunge', 1991, 'https://linktoimage.com/nevermind.jpg', 'https://youtube.com/nevermind', 'https://nirvana.com', 'This is the second studio album by Nirvana.', true, now(), now()),
  (gen_random_uuid(), 'Master of Puppets', (SELECT id FROM bands WHERE name = 'Metallica'), 'Thrash Metal', 1986, 'https://linktoimage.com/master_of_puppets.jpg', 'https://youtube.com/masterofpuppets', 'https://metallica.com', 'This is the third studio album by Metallica.', true, now(), now()),
  (gen_random_uuid(), 'Hybrid Theory', (SELECT id FROM bands WHERE name = 'Linkin Park'), 'Nu Metal', 2000, 'https://linktoimage.com/hybrid_theory.jpg', 'https://youtube.com/hybridtheory', 'https://linkinpark.com', 'This is the debut album by Linkin Park.', true,now(), now());

-- Populate Songs
INSERT INTO songs (id, title, album_id, lyrics_theme, created_at, updated_at)
VALUES
  (gen_random_uuid(), 'Smells Like Teen Spirit', (SELECT id FROM albums WHERE title = 'Nevermind'), 'Rebellion, Angst', now(), now()),
  (gen_random_uuid(), 'Come As You Are', (SELECT id FROM albums WHERE title = 'Nevermind'), 'Individuality', now(), now()),
  (gen_random_uuid(), 'Battery', (SELECT id FROM albums WHERE title = 'Master of Puppets'), 'Violence, Power', now(), now()),
  (gen_random_uuid(), 'Master of Puppets', (SELECT id FROM albums WHERE title = 'Master of Puppets'), 'Addiction, Control', now(), now()),
  (gen_random_uuid(), 'In the End', (SELECT id FROM albums WHERE title = 'Hybrid Theory'), 'Struggle, Perseverance', now(), now()),
  (gen_random_uuid(), 'Crawling', (SELECT id FROM albums WHERE title = 'Hybrid Theory'), 'Internal Struggle', now(), now());

-- Populate Requests
INSERT INTO requests (id, user_id, album_title, band_name, status, created_at, updated_at)
VALUES
  (gen_random_uuid(), (SELECT id FROM users WHERE username = 'user1'), 'In Utero', 'Nirvana', 'PENDING', now(), now()),
  (gen_random_uuid(), (SELECT id FROM users WHERE username = 'user1'), 'Reload', 'Metallica', 'PENDING', now(), now());
