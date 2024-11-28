package com.enslipchaussettes.api.infra.adresse;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GoogleSearchPlaceCandidates(@JsonProperty("place_id") String place_id, @JsonProperty("formatted_address") String formatted_address) {}


