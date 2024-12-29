# Use a lightweight C++ base image
FROM gcc:latest

# Set working directory inside the container
WORKDIR /app

# Copy the source code into the container
COPY src/main.cpp .

# Compile the C++ source code
RUN g++ -o server main.cpp

# Expose port 9090
EXPOSE 9090

# Command to run the server
CMD ["./server"]

