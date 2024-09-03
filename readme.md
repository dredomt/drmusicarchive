# Dr.Music Archive

Dr.Music Archive is a music library web application allowing users to browse, filter, and request records, while admins can manage records and users requests.

## Tech Stack

- **Backend**: Spring Boot (Java)
- **Frontend**: Angular
- **Database**: PostgreSQL

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- Node.js and npm (or Yarn)
- PostgreSQL

### Setup

#### Backend

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/dr-music-archive.git
   
2. Navigate to the backend directory: 
   ```cd dr-music-archive
   
3. Configure your PostgreSQL database in src/main/resources/application.properties:
   spring.datasource.url=jdbc:postgresql://localhost:5432/drmusic
   spring.datasource.username=your_username
   spring.datasource.password=your_password

4. Build and run the backend:
   ```mvn spring-boot:run

#### Frontend
1. Navigate to the Angular project directory:
   ```cd webapp/angular
2. Install dependencies:
   ```npm install
3. Build and serve the Angular application:
   ```ng serve

## Usage
Usage
Access the application at http://localhost:4200.
Admins can manage records and verify requests.
Users can browse records, filter, and request new records.
Database Schema
The database schema and initial data are managed using Flyway. Migration scripts are located in the src/main/resources/db/migration directory.

License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.