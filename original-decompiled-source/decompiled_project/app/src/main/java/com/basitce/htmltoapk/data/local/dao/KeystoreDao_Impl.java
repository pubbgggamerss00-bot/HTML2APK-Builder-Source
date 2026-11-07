package com.basitce.htmltoapk.data.local.dao;

import androidx.room.g0;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.internal.o0;
import pg.f0;

/* loaded from: classes.dex */
public final class KeystoreDao_Impl implements KeystoreDao {
    private final g0 __db;
    private final androidx.room.f<KeystoreEntity> __insertAdapterOfKeystoreEntity = new androidx.room.f<KeystoreEntity>() { // from class: com.basitce.htmltoapk.data.local.dao.KeystoreDao_Impl.1
        @Override // androidx.room.f
        public String createQuery() {
            return "INSERT OR REPLACE INTO `keystores` (`id`,`alias`,`path`,`password`,`keyAlias`,`algorithm`,`isPersisted`,`publicUri`,`keyPassword`,`createdAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.f
        public void bind(h6.d dVar, KeystoreEntity keystoreEntity) {
            dVar.d(1, keystoreEntity.getId());
            if (keystoreEntity.getAlias() == null) {
                dVar.e(2);
            } else {
                dVar.C(2, keystoreEntity.getAlias());
            }
            if (keystoreEntity.getPath() == null) {
                dVar.e(3);
            } else {
                dVar.C(3, keystoreEntity.getPath());
            }
            if (keystoreEntity.getPassword() == null) {
                dVar.e(4);
            } else {
                dVar.C(4, keystoreEntity.getPassword());
            }
            if (keystoreEntity.getKeyAlias() == null) {
                dVar.e(5);
            } else {
                dVar.C(5, keystoreEntity.getKeyAlias());
            }
            if (keystoreEntity.getAlgorithm() == null) {
                dVar.e(6);
            } else {
                dVar.C(6, keystoreEntity.getAlgorithm());
            }
            dVar.d(7, keystoreEntity.isPersisted() ? 1L : 0L);
            if (keystoreEntity.getPublicUri() == null) {
                dVar.e(8);
            } else {
                dVar.C(8, keystoreEntity.getPublicUri());
            }
            if (keystoreEntity.getKeyPassword() == null) {
                dVar.e(9);
            } else {
                dVar.C(9, keystoreEntity.getKeyPassword());
            }
            dVar.d(10, keystoreEntity.getCreatedAt());
        }
    };
    private final androidx.room.e<KeystoreEntity> __deleteAdapterOfKeystoreEntity = new androidx.room.e<KeystoreEntity>() { // from class: com.basitce.htmltoapk.data.local.dao.KeystoreDao_Impl.2
        @Override // androidx.room.e
        public String createQuery() {
            return "DELETE FROM `keystores` WHERE `id` = ?";
        }

        @Override // androidx.room.e
        public void bind(h6.d dVar, KeystoreEntity keystoreEntity) {
            dVar.d(1, keystoreEntity.getId());
        }
    };
    private final androidx.room.e<KeystoreEntity> __updateAdapterOfKeystoreEntity = new androidx.room.e<KeystoreEntity>() { // from class: com.basitce.htmltoapk.data.local.dao.KeystoreDao_Impl.3
        @Override // androidx.room.e
        public String createQuery() {
            return "UPDATE OR ABORT `keystores` SET `id` = ?,`alias` = ?,`path` = ?,`password` = ?,`keyAlias` = ?,`algorithm` = ?,`isPersisted` = ?,`publicUri` = ?,`keyPassword` = ?,`createdAt` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.e
        public void bind(h6.d dVar, KeystoreEntity keystoreEntity) {
            dVar.d(1, keystoreEntity.getId());
            if (keystoreEntity.getAlias() == null) {
                dVar.e(2);
            } else {
                dVar.C(2, keystoreEntity.getAlias());
            }
            if (keystoreEntity.getPath() == null) {
                dVar.e(3);
            } else {
                dVar.C(3, keystoreEntity.getPath());
            }
            if (keystoreEntity.getPassword() == null) {
                dVar.e(4);
            } else {
                dVar.C(4, keystoreEntity.getPassword());
            }
            if (keystoreEntity.getKeyAlias() == null) {
                dVar.e(5);
            } else {
                dVar.C(5, keystoreEntity.getKeyAlias());
            }
            if (keystoreEntity.getAlgorithm() == null) {
                dVar.e(6);
            } else {
                dVar.C(6, keystoreEntity.getAlgorithm());
            }
            dVar.d(7, keystoreEntity.isPersisted() ? 1L : 0L);
            if (keystoreEntity.getPublicUri() == null) {
                dVar.e(8);
            } else {
                dVar.C(8, keystoreEntity.getPublicUri());
            }
            if (keystoreEntity.getKeyPassword() == null) {
                dVar.e(9);
            } else {
                dVar.C(9, keystoreEntity.getKeyPassword());
            }
            dVar.d(10, keystoreEntity.getCreatedAt());
            dVar.d(11, keystoreEntity.getId());
        }
    };

    public KeystoreDao_Impl(g0 g0Var) {
        this.__db = g0Var;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f0 lambda$delete$1(KeystoreEntity keystoreEntity, h6.b bVar) {
        this.__deleteAdapterOfKeystoreEntity.handle(bVar, keystoreEntity);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getAll$3(h6.b bVar) throws Exception {
        h6.d dVarB0 = bVar.B0("SELECT * FROM keystores ORDER BY createdAt DESC");
        try {
            int iC = b6.n.c(dVarB0, "id");
            int iC2 = b6.n.c(dVarB0, "alias");
            int iC3 = b6.n.c(dVarB0, "path");
            int iC4 = b6.n.c(dVarB0, "password");
            int iC5 = b6.n.c(dVarB0, "keyAlias");
            int iC6 = b6.n.c(dVarB0, "algorithm");
            int iC7 = b6.n.c(dVarB0, "isPersisted");
            int iC8 = b6.n.c(dVarB0, "publicUri");
            int iC9 = b6.n.c(dVarB0, "keyPassword");
            int iC10 = b6.n.c(dVarB0, "createdAt");
            ArrayList arrayList = new ArrayList();
            while (dVarB0.t0()) {
                long j10 = dVarB0.getLong(iC);
                String strW = dVarB0.isNull(iC2) ? null : dVarB0.W(iC2);
                String strW2 = dVarB0.isNull(iC3) ? null : dVarB0.W(iC3);
                String strW3 = dVarB0.isNull(iC4) ? null : dVarB0.W(iC4);
                String strW4 = dVarB0.isNull(iC5) ? null : dVarB0.W(iC5);
                String strW5 = dVarB0.isNull(iC6) ? null : dVarB0.W(iC6);
                boolean z10 = ((int) dVarB0.getLong(iC7)) != 0;
                arrayList.add(new KeystoreEntity(j10, strW, strW2, strW3, strW4, strW5, z10, dVarB0.isNull(iC8) ? null : dVarB0.W(iC8), dVarB0.isNull(iC9) ? null : dVarB0.W(iC9), dVarB0.getLong(iC10)));
            }
            return arrayList;
        } finally {
            dVarB0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ KeystoreEntity lambda$getById$4(long j10, h6.b bVar) throws Exception {
        h6.d dVarB0 = bVar.B0("SELECT * FROM keystores WHERE id = ?");
        try {
            dVarB0.d(1, j10);
            int iC = b6.n.c(dVarB0, "id");
            int iC2 = b6.n.c(dVarB0, "alias");
            int iC3 = b6.n.c(dVarB0, "path");
            int iC4 = b6.n.c(dVarB0, "password");
            int iC5 = b6.n.c(dVarB0, "keyAlias");
            int iC6 = b6.n.c(dVarB0, "algorithm");
            int iC7 = b6.n.c(dVarB0, "isPersisted");
            int iC8 = b6.n.c(dVarB0, "publicUri");
            int iC9 = b6.n.c(dVarB0, "keyPassword");
            int iC10 = b6.n.c(dVarB0, "createdAt");
            KeystoreEntity keystoreEntity = null;
            if (dVarB0.t0()) {
                keystoreEntity = new KeystoreEntity(dVarB0.getLong(iC), dVarB0.isNull(iC2) ? null : dVarB0.W(iC2), dVarB0.isNull(iC3) ? null : dVarB0.W(iC3), dVarB0.isNull(iC4) ? null : dVarB0.W(iC4), dVarB0.isNull(iC5) ? null : dVarB0.W(iC5), dVarB0.isNull(iC6) ? null : dVarB0.W(iC6), ((int) dVarB0.getLong(iC7)) != 0, dVarB0.isNull(iC8) ? null : dVarB0.W(iC8), dVarB0.isNull(iC9) ? null : dVarB0.W(iC9), dVarB0.getLong(iC10));
            }
            return keystoreEntity;
        } finally {
            dVarB0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$insert$0(KeystoreEntity keystoreEntity, h6.b bVar) {
        return Long.valueOf(this.__insertAdapterOfKeystoreEntity.insertAndReturnId(bVar, keystoreEntity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f0 lambda$update$2(KeystoreEntity keystoreEntity, h6.b bVar) {
        this.__updateAdapterOfKeystoreEntity.handle(bVar, keystoreEntity);
        return f0.f21461a;
    }

    @Override // com.basitce.htmltoapk.data.local.dao.KeystoreDao
    public Object delete(final KeystoreEntity keystoreEntity, tg.e<? super f0> eVar) {
        keystoreEntity.getClass();
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.n
            @Override // eh.l
            public final Object invoke(Object obj) {
                return this.f5726a.lambda$delete$1(keystoreEntity, (h6.b) obj);
            }
        }, eVar, false, true);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.KeystoreDao
    public sh.f<List<KeystoreEntity>> getAll() {
        return o0.a(this.__db, new String[]{"keystores"}, new j(0));
    }

    @Override // com.basitce.htmltoapk.data.local.dao.KeystoreDao
    public Object getById(final long j10, tg.e<? super KeystoreEntity> eVar) {
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.k
            @Override // eh.l
            public final Object invoke(Object obj) {
                return KeystoreDao_Impl.lambda$getById$4(j10, (h6.b) obj);
            }
        }, eVar, true, false);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.KeystoreDao
    public Object insert(final KeystoreEntity keystoreEntity, tg.e<? super Long> eVar) {
        keystoreEntity.getClass();
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.m
            @Override // eh.l
            public final Object invoke(Object obj) {
                return this.f5724a.lambda$insert$0(keystoreEntity, (h6.b) obj);
            }
        }, eVar, false, true);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.KeystoreDao
    public Object update(KeystoreEntity keystoreEntity, tg.e<? super f0> eVar) {
        keystoreEntity.getClass();
        return b6.c.g(this.__db, new l(0, this, keystoreEntity), eVar, false, true);
    }
}
