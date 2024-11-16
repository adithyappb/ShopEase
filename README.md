## ShopEase: Modular E-commerce App with AWS Integration
A scalable Android e-commerce app built with Kotlin, MVVM, and AWS services for product management and real-time data processing.

# Features
- Modular Architecture: Built using MVVM for clear separation of concerns.
- AWS Integration: AWS Lambda for business logic, DynamoDB for product storage, and S3 for Lambda code deployment.
- Real-time Data Processing: Fetch product data with AWS and manage user interactions seamlessly.
- CI/CD: Automated deployment with GitHub Actions, ensuring faster releases.
- Agile Development: Implemented using Agile/Scrum methodologies for iterative development.

# Prerequisites
- Android Studio 4.0 or higher
- AWS account and IAM permissions
- Terraform for AWS infrastructure deployment

# Getting Started

# Set up the Android Project:
- Open the project in Android Studio.
- Sync the Gradle files.

# Configure AWS Infrastructure (Terraform):
- Update variables.tf with your AWS details (e.g., S3 bucket name).

# Run Terraform to deploy AWS resources:
- terraform init
- terraform apply

# Run the App:
- Connect your Android device or use an emulator.
- Run the app from Android Studio.