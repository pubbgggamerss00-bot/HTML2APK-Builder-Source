package n8;

import com.basitce.htmltoapk.data.local.dao.FolderDao;
import com.basitce.htmltoapk.data.local.dao.ProjectDao;
import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final FolderDao f18469a;

    /* renamed from: b, reason: collision with root package name */
    public final ProjectDao f18470b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Long f18471c;

    public i(FolderDao folderDao, ProjectDao projectDao) {
        this.f18469a = folderDao;
        this.f18470b = projectDao;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, vg.c cVar) {
        h hVar;
        FolderDao folderDao;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.f18461e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f18461e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(this, cVar);
            }
        }
        Object objCount = hVar.f18459c;
        ug.a aVar = ug.a.f29706a;
        int i11 = hVar.f18461e;
        if (i11 == 0) {
            pg.q.b(objCount);
            folderDao = this.f18469a;
            hVar.f18457a = folderDao;
            hVar.f18458b = str;
            hVar.f18461e = 1;
            objCount = folderDao.count(hVar);
            if (objCount != aVar) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(objCount);
            return objCount;
        }
        str = hVar.f18458b;
        folderDao = hVar.f18457a;
        pg.q.b(objCount);
        FolderEntity folderEntity = new FolderEntity(0L, str, ((Number) objCount).intValue(), 0L, 9, null);
        hVar.f18457a = null;
        hVar.f18458b = null;
        hVar.f18461e = 2;
        Object objInsert = folderDao.insert(folderEntity, hVar);
        return objInsert == aVar ? aVar : objInsert;
    }
}
