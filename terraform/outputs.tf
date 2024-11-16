output "lambda_function_name" {
  value = aws_lambda_function.product_lambda.function_name
  description = "The name of the AWS Lambda function"
}

output "dynamodb_table_name" {
  value = aws_dynamodb_table.product_table.name
  description = "The name of the DynamoDB table for products"
}

output "lambda_function_arn" {
  value = aws_lambda_function.product_lambda.arn
  description = "The ARN of the Lambda function"
}

output "dynamodb_table_arn" {
  value = aws_dynamodb_table.product_table.arn
  description = "The ARN of the DynamoDB table"
}
