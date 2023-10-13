<div class="modal fade" id="filterModal" tabindex="-1" aria-labelledby="filterModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="filterModalLabel">Filter Properties</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form id="filterForm">
                    <div class="row">
                        <div class="col">
                            <label for="minimumPrice" class="form-label">Minimum Price</label>
                            <input type="text" id="minimumPrice" class="form-control">
                        </div>
                        <div class="col">
                            <label for="maximumPrice" class="form-label">Maximum Price</label>
                            <input type="text" class="form-control">
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="city" class="form-label">City</label>
                        <select class="form-select" id="city" name="city">
                            <option value="Residential Land">Residential Land</option>
                            <option value="Commercial">Commercial</option>
                            <option value="Condominium">Condominium</option>
                            <option value="Townhouse">Townhouse</option>
                            <option value="Multi-unit dwelling">Multi-unit dwelling</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="location" class="form-label">Location/Area in the City</label>
                        <input type="text" class="form-control" id="location" name="location">
                    </div>
                    <div class="mb-3">
                        <label for="bedrooms" class="form-label">Number of Bedrooms</label>
                        <input type="text" class="form-control" id="bedrooms" name="bedrooms">
                    </div>
                    <div class="mb-3">
                        <label for="bathrooms" class="form-label">Number of Bathrooms</label>
                        <input type="text" class="form-control" id="bathrooms" name="bathrooms">
                    </div>
                    <div class="mb-3">
                        <label for="propertyType" class="form-label">Property Type</label>
                        <select class="form-select" id="propertyType" name="propertyType">
                            <option value="Residential Land">Residential Land</option>
                            <option value="Commercial">Commercial</option>
                            <option value="Condominium">Condominium</option>
                            <option value="Townhouse">Townhouse</option>
                            <option value="Multi-unit dwelling">Multi-unit dwelling</option>
                        </select>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Apply Filters</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
