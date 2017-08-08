package contracts.ships

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url '/ships'
    }
    response {
        status 200
        body("deathstar")
        headers {
            contentType(textPlain())
        }
    }
}
