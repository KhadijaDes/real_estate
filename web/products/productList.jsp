<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>Home Page</title>
    </head>
    <body>
        <jsp:include page="../common/header.jsp" />

        <div class="container">

            <nav class="navbar navbar-light bg-light">
                <div class="container-fluid">
                    <button class="btn btn-outline-success me-2" onclick="openFilterModal()" type="button">Filter</button>
                    <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </nav>

        </div>



        <div class="container">
            <div class="row row-cols-1 row-cols-md-4 g-4">
                <% for (int i = 1; i <= 20; i++) { %>
                <div class="col">
                    <div class="card" onclick="openCardModal('Build your dream home', [
                                'https://photos.zillowstatic.com/fp/cb1d9b4cfe1258bcc239b04306afd872-cc_ft_1536.webp',
                                'https://photos.zillowstatic.com/fp/6b1853873c2703b1d5e00c92c5bdc1eb-cc_ft_384.webp',
                                'https://photos.zillowstatic.com/fp/0dc7ceff5f6c132f3d3f1acc5922e950-cc_ft_384.webp',
                            ], 'Build your dream home, or invest in your future, on this beautiful .23 acre lot in Lehigh Acres community. This lot is located just minutes drive from Walmart, and downtown Lehigh Acres. Elementary and Middle school just 5 min drive and Lehigh Senior High school just 3 mins away. Enjoy the stunning Florida Sunsets on this oversized lot. This lot is also just a short car ride to both the Boston Redsox & Minnesota Twins spring training facilities, International airport, Downtown & Central Fort Myers, Fort Myers Beaches, Sanibel/Captiva Islands, Miromar Outlets, Gulf Coast Town Center, Labelle, and Pine Island/ Matalacha area. Location, Location and best price on market!')">
                        <img src="https://photos.zillowstatic.com/fp/cb1d9b4cfe1258bcc239b04306afd872-cc_ft_1536.webp" class="card-img-top" alt="..." height="200">
                        <div class="card-body">
                            <h5 class="card-title max-lines-1">Build your dream home</h5>
                            <p class="card-text max-lines-2">Build your dream home, or invest in your future, on this beautiful .23 acre lot in Lehigh Acres community. This lot is located just minutes drive from Walmart, and downtown Lehigh Acres. Elementary and Middle school just 5 min drive and Lehigh Senior High school just 3 mins away. Enjoy the stunning Florida Sunsets on this oversized lot. This lot is also just a short car ride to both the Boston Redsox & Minnesota Twins spring training facilities, International airport, Downtown & Central Fort Myers, Fort Myers Beaches, Sanibel/Captiva Islands, Miromar Outlets, Gulf Coast Town Center, Labelle, and Pine Island/ Matalacha area. Location, Location and best price on market!</p>
                        </div>
                    </div>
                </div>
                <% }%>
            </div>        
        </div>




        <jsp:include page="product_details_modal.jsp" />
                <jsp:include page="filter_modal.jsp" />
        <jsp:include page="../common/footer.jsp" />
        <script>
            // JavaScript to open the modal and set content
            function openCardModal(title, images, details) {
                var modal = $('#productDetailsModal');

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
            
            
            function openFilterModal() {
                var modal = $('#filterModal');          
                // Show the modal
                modal.modal('show');
            }
        </script>



    </body>
</html>
