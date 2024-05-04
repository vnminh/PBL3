<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<!-- Boxicons -->
	<link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>
	<!-- My CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/adminstyle.css">

	<title>AdminHub</title>
</head>
<body>


	<!-- SIDEBAR -->
	<section id="sidebar">
		<a href="#" class="brand">
			<i class='bx bxs-smile'></i>
			<span class="text">AdminHub</span>
		</a>
		<ul class="side-menu top">
			<li class="active">
				<a href="#">
					<i class='bx bxs-dashboard' ></i>
					<span class="text">Dashboard</span>
				</a>
			</li>
			<li>
				<a href="#">
					<i class='bx bx-user'></i>
					<span class="text">User management</span>
				</a>
			</li>
			<li>
				<a href="#">
					<i class='bx bxs-doughnut-chart' ></i>
					<span class="text">Analytics</span>
				</a>
			</li>
		</ul>
		<ul class="side-menu">
			<li>
				<a href="#">
					<i class='bx bxs-cog' ></i>
					<span class="text">Settings</span>
				</a>
			</li>
			<li>
				<a href="#" class="logout">
					<i class='bx bxs-log-out-circle' ></i>
					<span class="text">Logout</span>
				</a>
			</li>
		</ul>
	</section>
	<!-- SIDEBAR -->



	<!-- CONTENT -->
	<section id="content">
		<!-- NAVBAR -->
		<nav>
			<i class='bx bx-menu' ></i>
			<a href="#" class="nav-link">Categories</a>
			<form action="#">
				<div class="form-input">
					<input type="search" placeholder="Search...">
					<button type="submit" class="search-btn"><i class='bx bx-search' ></i></button>
				</div>
			</form>
			<input type="checkbox" id="switch-mode" hidden>
			<label for="switch-mode" class="switch-mode"></label>
			<a href="#" class="notification">
				<i class='bx bxs-bell' ></i>
				<span class="num">8</span>
			</a>
			<a href="#" class="profile">
				<img src="img/people.png">
			</a>
		</nav>
		<!-- NAVBAR -->

		<!-- MAIN -->
		<main>
			<div class="table-data">
				<div class="order">
					<div class="head">
						<h3>Recent Orders</h3>
						<i class='bx bx-search' ></i>
						<i class='bx bx-filter' ></i>
					</div>
					<div class="filter">
						<div class="filter__page-controller">
							<button class="button btnPrev">
							  <svg class="btn__icon" version="1.1" id="Capa_1" xmlns="http://www.w3.org/2000/svg"
								xmlns:xlink="http://www.w3.org/1999/xlink" viewBox="0 0 500 500" xml:space="preserve">
								<g>
								  <path d="M145.188,238.575l215.5-215.5c5.3-5.3,5.3-13.8,0-19.1s-13.8-5.3-19.1,0l-225.1,225.1c-5.3,5.3-5.3,13.8,0,19.1l225.1,225
								  c2.6,2.6,6.1,4,9.5,4s6.9-1.3,9.5-4c5.3-5.3,5.3-13.8,0-19.1L145.188,238.575z" />
								</g>
							  </svg>
							</button>
							<div class="page__number">
							  <div class="page__current">1</div>
							  <div class="page__border">/</div>
							  <div class="page__total">10</div>
							</div>
							<button class="button btnNext">
							  <svg class="btn__icon" version="1.1" id="Capa_1" xmlns="http://www.w3.org/2000/svg"
								xmlns:xlink="http://www.w3.org/1999/xlink" viewBox="0 0 500 500" xml:space="preserve">
								<g>
								  <path d="M360.731,229.075l-225.1-225.1c-5.3-5.3-13.8-5.3-19.1,0s-5.3,13.8,0,19.1l215.5,215.5l-215.5,215.5
								  c-5.3,5.3-5.3,13.8,0,19.1c2.6,2.6,6.1,4,9.5,4c3.4,0,6.9-1.3,9.5-4l225.1-225.1C365.931,242.875,365.931,234.275,360.731,229.075z
								  " />
								</g>
							  </svg>
							</button>
						</div>
					</div>
					<table class = 'content-table'>
						<thead>
							<tr>
								<th>ID</th>
								<th>Ten</th>
								<th>SDT</th>
								<th>Email</th>
								<th>Mat khau</th>
								<th>Vai tro</th>
								<th>Trang thai</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>001</td>
								<td>Minh</td>
								<td>065656556</td>
								<td>m@gmail.com</td>
								<td><input type="password" value=123456 readonly></td>
								<td>KH</td>
								<td>AC</td>
							</tr>
							<tr>
								<td>001</td>
								<td>Minh</td>
								<td>065656556</td>
								<td>m@gmail.com</td>
								<td><input type="password" value=123456 readonly></td>
								<td>KH</td>
								<td>AC</td>
							</tr>
							<tr>
								<td>001</td>
								<td>Minh</td>
								<td>065656556</td>
								<td>m@gmail.com</td>
								<td><input type="password" value=123456 readonly></td>
								<td>KH</td>
								<td>AC</td>
							</tr>
							<tr>
								<td>001</td>
								<td>Minh</td>
								<td>065656556</td>
								<td>m@gmail.com</td>
								<td><input type="password" value=123456 readonly></td>
								<td>KH</td>
								<td>AC</td>
							</tr>
							<tr>
								<td>001</td>
								<td>Minh</td>
								<td>065656556</td>
								<td>m@gmail.com</td>
								<td><input type="password" value=123456 readonly></td>
								<td>KH</td>
								<td>AC</td>
							</tr>
							<tr>
								<td>001</td>
								<td>Minh</td>
								<td>065656556</td>
								<td>m@gmail.com</td>
								<td><input type="password" value=123456 readonly></td>
								<td>KH</td>
								<td>AC</td>
							</tr>
						</tbody>
					</table>
				</div>

				</div>
			</div>
		</main>
		<!-- MAIN -->
	</section>
	<!-- CONTENT -->
	

	<script src="${pageContext.request.contextPath}/js/script.js"></script>
</body>
</html>