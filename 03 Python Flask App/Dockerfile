# Use the official Python image as the base image
FROM python:3.9

# Set the working directory inside the container
WORKDIR /app

# Copy the application files into the container
COPY . .

# Install Python dependencies
RUN pip install -r requirements.txt

# Command to run the Flask application
CMD ["python", "app.py"]

# Expose port 5000
EXPOSE 5000

