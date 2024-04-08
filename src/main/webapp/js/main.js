var currentURL = window.location.protocol + "//" + window.location.host;
function formatCurrency(amount) {
	// Kiểm tra xem giá trị đầu vào có phải là số không
	if (typeof amount !== 'number') {
		return 'Invalid input';
	}

	// Chuyển đổi số thành chuỗi và ngược lại
	const formattedAmount = Number(amount).toLocaleString('vi-VN', { style: 'currency', currency: 'VND' });

	return formattedAmount;
}
function showAndHideMenu() {
    var menu = document.querySelector(".menu-all-category");
    if(menu.classList.contains("slideInDown")) {
        menu.classList.remove("slideInDown");
        menu.classList.add("slideOutUp");
        menu.classList.remove("show");
    }
    else {
        menu.classList.add("slideInDown")
        menu.classList.add("show");
        menu.classList.remove("slideOutUp");
    }
}

function showNewestItem() {
    var url = currentURL + "/api/user/getNewestItem";
    var html = "";
    return fetch(url)
		.then(response => {
			if (!response.ok) {
				throw new Error("Lỗi khi lấy dữ liệu từ URL");
			}
			return response.json();
		})
		.then(data => {
            data.forEach(item => {
                html += `<div class="col-xl-3 col-lg-4 col-md-6">
                <div class="card p-3 mb-4">
                    <a
                        href="${currentURL}/product?id=${item.id}"
                        class="img-wrap text-center"> 
                                <img width="200" height="200" class="img-fluid"
                                    src="${currentURL}${item.urlImage}"
                                    alt="">
                    </a>
                    <div class="info-wrap mt-2">
                        <a
                            href="${currentURL}/product?id=${item.id}"
                            class="title">${item.ten}</a>
                        <div>
                                    <span class="price mt-1 fw-bold"> ${formatCurrency(item.giaBan)}
                                    </span>
                                    <span class="ms-2 text-muted text-decoration-line-through">
                                        100.000₫
                                    </span>
                                    <span class="ms-2 badge bg-info"> 50%
                                    </span>
                        </div>
                    </div>
                </div>
            </div>`;        
            });

            document.querySelector(".contain-newest").innerHTML = html;

        })
}