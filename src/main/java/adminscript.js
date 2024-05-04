var currentURL = window.location.protocol + "//" + window.location.host;
const allSideMenu = document.querySelectorAll('#sidebar .side-menu.top li a');

allSideMenu.forEach(item=> {
	const li = item.parentElement;

	item.addEventListener('click', function () {
		allSideMenu.forEach(i=> {
			i.parentElement.classList.remove('active');
		})
		li.classList.add('active');
	})
});




// TOGGLE SIDEBAR
const menuBar = document.querySelector('#content nav .bx.bx-menu');
const sidebar = document.getElementById('sidebar');

menuBar.addEventListener('click', function () {
	sidebar.classList.toggle('hide');
})







const searchButton = document.querySelector('#content nav form .form-input button');
const searchButtonIcon = document.querySelector('#content nav form .form-input button .bx');
const searchForm = document.querySelector('#content nav form');

searchButton.addEventListener('click', function (e) {
	if(window.innerWidth < 576) {
		e.preventDefault();
		searchForm.classList.toggle('show');
		if(searchForm.classList.contains('show')) {
			searchButtonIcon.classList.replace('bx-search', 'bx-x');
		} else {
			searchButtonIcon.classList.replace('bx-x', 'bx-search');
		}
	}
})





if(window.innerWidth < 768) {
	sidebar.classList.add('hide');
} else if(window.innerWidth > 576) {
	searchButtonIcon.classList.replace('bx-x', 'bx-search');
	searchForm.classList.remove('show');
}


window.addEventListener('resize', function () {
	if(this.innerWidth > 576) {
		searchButtonIcon.classList.replace('bx-x', 'bx-search');
		searchForm.classList.remove('show');
	}
})



const switchMode = document.getElementById('switch-mode');

switchMode.addEventListener('change', function () {
	if(this.checked) {
		document.body.classList.add('dark');
	} else {
		document.body.classList.remove('dark');
	}
})


/*ClickUserManage*/
const userManage = document.querySelector('#sidebar .side-menu.top li:nth-child(2) a')
userManage.addEventListener('click',function(){
	var url = currentURL + "/api/admin/getAllUser";
    var html = "";
    return fetch(url)
		.then(response => {
			if (!response.ok) {
				throw new Error("Lỗi khi lấy dữ liệu từ URL");
			}
			return response.json();
		})
		.then(data => {
            data.forEach(item =>{
				html +=
				`<tr>
					<td>${item.id}</td>
					<td>${item.ten}</td>
					<td>${item.SDT}</td>
					<td>${item.email}</td>
					<td><input type="password" value=${item.matKhau} readonly></td>
					<td>${item.role}</td>
					<td>${item.status}</td>
				</tr>`
			});
            html = 
			`<table class = 'content-table'>
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
				<tbody>`
				+ html +
			`</tbody> </table>`;
			document.querySelector('#content main').innerHTML = html;
        })
	
})


