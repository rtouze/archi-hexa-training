package com.enslipchaussettes.api.domain.panier;

import java.util.List;
import java.util.UUID;

public interface UtilisationPanier {
    UUID initPanier();

    void ajoutReference(UUID uuid, String reference);

    List<String> showReference(UUID uuid);

    void deleteReference(UUID uuid, String ref);

    void showReference(UUID uuid, PanierPresenter panierPresenter);
}