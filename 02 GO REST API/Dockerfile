# Using official image of Go as the base image

FROM golang:1.23-alpine

# Setting up the working directory inside the container

WORKDIR /app

# Copy the Go source code into the container

COPY . .

# Building the Go application

RUN go build -o main .

# Command to run Go application

CMD ["./main"]

# Expose port 8000

EXPOSE 8080
