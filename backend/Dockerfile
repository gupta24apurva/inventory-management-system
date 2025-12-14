# ---------- STAGE 1: Build ----------
FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /app

# Copy pom.xml first for dependency caching
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build the jar
RUN mvn clean package -DskipTests


# ---------- STAGE 2: Run ----------
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copy the built jar
COPY --from=builder /app/target/*.jar app.jar

# Render sets PORT automatically
ENV PORT=5050

EXPOSE 5050

CMD ["java", "-jar", "app.jar"]
