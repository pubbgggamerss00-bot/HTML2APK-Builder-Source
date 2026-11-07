package com.basitce.htmltoapk.data.local.dao;

import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.util.List;
import pg.f0;

/* loaded from: classes.dex */
public interface KeystoreDao {
    Object delete(KeystoreEntity keystoreEntity, tg.e<? super f0> eVar);

    sh.f<List<KeystoreEntity>> getAll();

    Object getById(long j10, tg.e<? super KeystoreEntity> eVar);

    Object insert(KeystoreEntity keystoreEntity, tg.e<? super Long> eVar);

    Object update(KeystoreEntity keystoreEntity, tg.e<? super f0> eVar);
}
