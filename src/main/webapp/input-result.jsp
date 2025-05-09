<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Kết quả</title>
    <meta charset="UTF-8">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
        }
        .result-container {
            max-width: 400px;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        h2 {
            color: #4CAF50;
            margin-top: 0;
        }
        .info-item {
            margin-bottom: 10px;
        }
        .label {
            font-weight: bold;
        }
        .back-link {
            display: inline-block;
            margin-top: 20px;
            color: #2196F3;
            text-decoration: none;
        }
        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="result-container">
        <h2>Thông tin đã nhập</h2>

        <div class="info-item">
            <span class="label">Tên người dùng:</span>
            <%= request.getParameter("username") %>
        </div>

        <div class="info-item">
            <span class="label">Giới tính:</span>
            <%= request.getParameter("gender") %>
        </div>

        <a href="input" class="back-link">Quay lại form</a>
    </div>
</body>
</html>