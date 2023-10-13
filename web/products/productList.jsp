<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>Home Page</title>
    </head>
    <body>
        <jsp:include page="../common/header.jsp" />

        <div class="row row-cols-1 row-cols-md-4 g-4">
            <% for (int i = 1; i <= 20; i++) { %>
            <div class="col">
                <div class="card" onclick="openCardModal('Card Title', [
                   'https://www.cio.com/wp-content/uploads/2023/07/shutterstock_676661263.jpg?quality=50&strip=all&w=1024',
                   'https://www.cio.com/wp-content/uploads/2023/07/shutterstock_676661263.jpg?quality=50&strip=all&w=1024',
                   'https://www.cio.com/wp-content/uploads/2023/07/shutterstock_676661263.jpg?quality=50&strip=all&w=1024',
                   'https://www.cio.com/wp-content/uploads/2023/07/shutterstock_676661263.jpg?quality=50&strip=all&w=1024',
                ], 'This is the card details and information.')">
                    <img src="https://www.cio.com/wp-content/uploads/2023/07/shutterstock_676661263.jpg?quality=50&strip=all&w=1024" class="card-img-top" alt="..." height="200">
                    <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text max-lines-2">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                    </div>
                </div>
            </div>
            <% }%>
        </div>
        <jsp:include page="modal.jsp" />
        <jsp:include page="../common/footer.jsp" />
        <script>
    // JavaScript to open the modal and set content
    function openCardModal(title, images, details) {
        var modal = $('#cardModal');

        // Set the modal title
        modal.find('.modal-title').text(title);

        // Create carousel indicators and images
        var carouselIndicators = modal.find('#carouselIndicators');
        var carouselImages = modal.find('#carouselImages');
        carouselIndicators.empty();
        carouselImages.empty();

        for (var i = 0; i < images.length; i++) {
            var activeClass = i === 0 ? 'active' : '';
            carouselIndicators.append('<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="' + i + '" class="' + activeClass + '" aria-label="Slide ' + (i + 1) + '"></button>');
            carouselImages.append('<div class="carousel-item ' + activeClass + '"><img src="' + images[i] + '" class="d-block w-100" alt="..."></div>');
        }

        // Set the modal details
        modal.find('#modalDetails').text(details);

        // Show the modal
        modal.modal('show');
    }
</script>



    </body>
</html>
