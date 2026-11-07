package com.basitce.htmltoapk.data.local.dao;

import androidx.room.g0;
import com.basitce.htmltoapk.data.local.dao.FolderDao;
import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.internal.o0;
import pg.f0;

/* loaded from: classes.dex */
public final class FolderDao_Impl implements FolderDao {
    private final g0 __db;
    private final androidx.room.f<FolderEntity> __insertAdapterOfFolderEntity = new androidx.room.f<FolderEntity>() { // from class: com.basitce.htmltoapk.data.local.dao.FolderDao_Impl.1
        @Override // androidx.room.f
        public String createQuery() {
            return "INSERT OR ABORT INTO `folders` (`id`,`name`,`sortOrder`,`createdAt`) VALUES (nullif(?, 0),?,?,?)";
        }

        @Override // androidx.room.f
        public void bind(h6.d dVar, FolderEntity folderEntity) {
            dVar.d(1, folderEntity.getId());
            if (folderEntity.getName() == null) {
                dVar.e(2);
            } else {
                dVar.C(2, folderEntity.getName());
            }
            dVar.d(3, folderEntity.getSortOrder());
            dVar.d(4, folderEntity.getCreatedAt());
        }
    };
    private final androidx.room.e<FolderEntity> __updateAdapterOfFolderEntity = new androidx.room.e<FolderEntity>() { // from class: com.basitce.htmltoapk.data.local.dao.FolderDao_Impl.2
        @Override // androidx.room.e
        public String createQuery() {
            return "UPDATE OR ABORT `folders` SET `id` = ?,`name` = ?,`sortOrder` = ?,`createdAt` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.e
        public void bind(h6.d dVar, FolderEntity folderEntity) {
            dVar.d(1, folderEntity.getId());
            if (folderEntity.getName() == null) {
                dVar.e(2);
            } else {
                dVar.C(2, folderEntity.getName());
            }
            dVar.d(3, folderEntity.getSortOrder());
            dVar.d(4, folderEntity.getCreatedAt());
            dVar.d(5, folderEntity.getId());
        }
    };

    public FolderDao_Impl(g0 g0Var) {
        this.__db = g0Var;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$count$5(h6.b bVar) throws Exception {
        h6.d dVarB0 = bVar.B0("SELECT COUNT(*) FROM folders");
        try {
            Integer numValueOf = null;
            if (dVarB0.t0() && !dVarB0.isNull(0)) {
                numValueOf = Integer.valueOf((int) dVarB0.getLong(0));
            }
            return numValueOf;
        } finally {
            dVarB0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$delete$3(long j10, tg.e eVar) {
        return FolderDao.DefaultImpls.delete(this, j10, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f0 lambda$deleteById$8(long j10, h6.b bVar) throws Exception {
        h6.d dVarB0 = bVar.B0("DELETE FROM folders WHERE id = ?");
        try {
            dVarB0.d(1, j10);
            dVarB0.t0();
            return f0.f21461a;
        } finally {
            dVarB0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getAll$4(h6.b bVar) throws Exception {
        h6.d dVarB0 = bVar.B0("SELECT * FROM folders ORDER BY sortOrder ASC, createdAt ASC");
        try {
            int iC = b6.n.c(dVarB0, "id");
            int iC2 = b6.n.c(dVarB0, "name");
            int iC3 = b6.n.c(dVarB0, "sortOrder");
            int iC4 = b6.n.c(dVarB0, "createdAt");
            ArrayList arrayList = new ArrayList();
            while (dVarB0.t0()) {
                arrayList.add(new FolderEntity(dVarB0.getLong(iC), dVarB0.isNull(iC2) ? null : dVarB0.W(iC2), (int) dVarB0.getLong(iC3), dVarB0.getLong(iC4)));
            }
            return arrayList;
        } finally {
            dVarB0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$insert$0(FolderEntity folderEntity, h6.b bVar) {
        return Long.valueOf(this.__insertAdapterOfFolderEntity.insertAndReturnId(bVar, folderEntity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f0 lambda$releaseProjects$7(long j10, h6.b bVar) throws Exception {
        h6.d dVarB0 = bVar.B0("UPDATE projects SET folderId = NULL WHERE folderId = ?");
        try {
            dVarB0.d(1, j10);
            dVarB0.t0();
            return f0.f21461a;
        } finally {
            dVarB0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$reorder$2(List list, tg.e eVar) {
        return FolderDao.DefaultImpls.reorder(this, list, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f0 lambda$setSortOrder$6(int i10, long j10, h6.b bVar) throws Exception {
        h6.d dVarB0 = bVar.B0("UPDATE folders SET sortOrder = ? WHERE id = ?");
        try {
            dVarB0.d(1, i10);
            dVarB0.d(2, j10);
            dVarB0.t0();
            return f0.f21461a;
        } finally {
            dVarB0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f0 lambda$update$1(FolderEntity folderEntity, h6.b bVar) {
        this.__updateAdapterOfFolderEntity.handle(bVar, folderEntity);
        return f0.f21461a;
    }

    @Override // com.basitce.htmltoapk.data.local.dao.FolderDao
    public Object count(tg.e<? super Integer> eVar) {
        return b6.c.g(this.__db, new e(0), eVar, true, false);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.FolderDao
    public Object delete(final long j10, tg.e<? super f0> eVar) {
        return b6.c.f(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.i
            @Override // eh.l
            public final Object invoke(Object obj) {
                return this.f5717a.lambda$delete$3(j10, (tg.e) obj);
            }
        }, eVar);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.FolderDao
    public Object deleteById(final long j10, tg.e<? super f0> eVar) {
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.g
            @Override // eh.l
            public final Object invoke(Object obj) {
                return FolderDao_Impl.lambda$deleteById$8(j10, (h6.b) obj);
            }
        }, eVar, false, true);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.FolderDao
    public sh.f<List<FolderEntity>> getAll() {
        return o0.a(this.__db, new String[]{"folders"}, new c());
    }

    @Override // com.basitce.htmltoapk.data.local.dao.FolderDao
    public Object insert(final FolderEntity folderEntity, tg.e<? super Long> eVar) {
        folderEntity.getClass();
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.h
            @Override // eh.l
            public final Object invoke(Object obj) {
                return this.f5715a.lambda$insert$0(folderEntity, (h6.b) obj);
            }
        }, eVar, false, true);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.FolderDao
    public Object releaseProjects(final long j10, tg.e<? super f0> eVar) {
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.f
            @Override // eh.l
            public final Object invoke(Object obj) {
                return FolderDao_Impl.lambda$releaseProjects$7(j10, (h6.b) obj);
            }
        }, eVar, false, true);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.FolderDao
    public Object reorder(List<Long> list, tg.e<? super f0> eVar) {
        return b6.c.f(this.__db, new b(0, this, list), eVar);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.FolderDao
    public Object setSortOrder(final long j10, final int i10, tg.e<? super f0> eVar) {
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.a
            @Override // eh.l
            public final Object invoke(Object obj) {
                return FolderDao_Impl.lambda$setSortOrder$6(i10, j10, (h6.b) obj);
            }
        }, eVar, false, true);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.FolderDao
    public Object update(final FolderEntity folderEntity, tg.e<? super f0> eVar) {
        folderEntity.getClass();
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.d
            @Override // eh.l
            public final Object invoke(Object obj) {
                return this.f5710a.lambda$update$1(folderEntity, (h6.b) obj);
            }
        }, eVar, false, true);
    }
}
