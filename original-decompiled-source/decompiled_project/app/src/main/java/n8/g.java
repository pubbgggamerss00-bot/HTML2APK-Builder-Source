package n8;

import android.database.Cursor;
import android.net.Uri;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import f9.fg;
import java.io.File;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Hilt_HtmlToApkApplication f18445a;

    /* renamed from: b, reason: collision with root package name */
    public final s f18446b;

    public g(Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, s projectRepository) {
        kotlin.jvm.internal.r.e(projectRepository, "projectRepository");
        this.f18445a = hilt_HtmlToApkApplication;
        this.f18446b = projectRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0219 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, String str, String str2, String str3, Long l10, Uri uri, eh.p pVar, vg.c cVar) throws Exception {
        b bVar;
        eh.p pVar2;
        g gVar2;
        ProjectEntity projectEntity;
        g gVar3;
        long j10;
        long j11;
        ProjectEntity projectEntityCopy$default;
        s sVar;
        gVar.getClass();
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f18381g;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f18381g = i10 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(gVar, cVar);
            }
        }
        Object objInvoke = bVar.f18379e;
        ug.a aVar = ug.a.f29706a;
        int i11 = bVar.f18381g;
        if (i11 == 0) {
            pg.q.b(objInvoke);
            String strB0 = mh.y.b0(50, str2);
            String strB02 = mh.y.b0(50, str2);
            mh.k kVar = fg.X0;
            ProjectEntity projectEntity2 = new ProjectEntity(0L, strB0, strB02, fg.f.a(str2), 1, "1.0", 24, 36, null, str3, null, uri != null ? uri.toString() : null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, str, l10, 0L, 0L, -2815, -1, 12, null);
            s sVar2 = gVar.f18446b;
            bVar.f18375a = gVar;
            bVar.f18376b = pVar;
            bVar.f18377c = projectEntity2;
            bVar.f18381g = 1;
            Object objInsert = sVar2.f18583a.insert(projectEntity2, bVar);
            if (objInsert != aVar) {
                objInvoke = objInsert;
                pVar2 = pVar;
                gVar2 = gVar;
                projectEntity = projectEntity2;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                long j12 = bVar.f18378d;
                projectEntity = (ProjectEntity) bVar.f18376b;
                gVar3 = (g) bVar.f18375a;
                try {
                    pg.q.b(objInvoke);
                    j11 = j12;
                    try {
                        projectEntityCopy$default = ProjectEntity.copy$default(projectEntity, j11, null, null, null, 0, null, 0, 0, null, null, ((File) objInvoke).getAbsolutePath(), null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -1026, -1, 15, null);
                        sVar = gVar3.f18446b;
                        bVar.f18375a = gVar3;
                        bVar.f18376b = projectEntityCopy$default;
                        bVar.f18378d = j11;
                        bVar.f18381g = 3;
                    } catch (Exception e10) {
                        e = e10;
                        j10 = j11;
                    }
                } catch (Exception e11) {
                    e = e11;
                    j10 = j12;
                }
                return sVar.c(projectEntityCopy$default, bVar) != aVar ? aVar : projectEntityCopy$default;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Exception exc = (Exception) bVar.f18375a;
                pg.q.b(objInvoke);
                throw exc;
            }
            j10 = bVar.f18378d;
            ProjectEntity projectEntity3 = (ProjectEntity) bVar.f18376b;
            gVar3 = (g) bVar.f18375a;
            try {
                pg.q.b(objInvoke);
                return projectEntity3;
            } catch (Exception e12) {
                e = e12;
            }
            bVar.f18375a = e;
            bVar.f18376b = null;
            bVar.f18377c = null;
            bVar.f18381g = 4;
            if (gVar3.c(j10, bVar) != aVar) {
                throw e;
            }
        } else {
            projectEntity = bVar.f18377c;
            pVar2 = (eh.p) bVar.f18376b;
            gVar2 = (g) bVar.f18375a;
            pg.q.b(objInvoke);
        }
        long jLongValue = ((Number) objInvoke).longValue();
        if (jLongValue == 0) {
            throw new IllegalStateException("Failed to insert project");
        }
        try {
            File file = new File(gVar2.d(jLongValue), "content");
            file.mkdirs();
            bVar.f18375a = gVar2;
            bVar.f18376b = projectEntity;
            bVar.f18377c = null;
            bVar.f18378d = jLongValue;
            bVar.f18381g = 2;
            objInvoke = pVar2.invoke(file, bVar);
            if (objInvoke != aVar) {
                gVar3 = gVar2;
                j11 = jLongValue;
                projectEntityCopy$default = ProjectEntity.copy$default(projectEntity, j11, null, null, null, 0, null, 0, 0, null, null, ((File) objInvoke).getAbsolutePath(), null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -1026, -1, 15, null);
                sVar = gVar3.f18446b;
                bVar.f18375a = gVar3;
                bVar.f18376b = projectEntityCopy$default;
                bVar.f18378d = j11;
                bVar.f18381g = 3;
                if (sVar.c(projectEntityCopy$default, bVar) != aVar) {
                }
            }
        } catch (Exception e13) {
            e = e13;
            gVar3 = gVar2;
            j10 = jLongValue;
        }
    }

    public static final String b(g gVar, Uri uri) {
        Object objA;
        gVar.getClass();
        if (!kotlin.jvm.internal.r.a(uri.getScheme(), "content")) {
            return uri.getLastPathSegment();
        }
        try {
            Cursor cursorQuery = gVar.f18445a.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    objA = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                    cursorQuery.close();
                } finally {
                }
            } else {
                objA = null;
            }
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        return (String) (objA instanceof p.a ? null : objA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j10, vg.c cVar) {
        e eVar;
        g gVar;
        g gVar2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f18426e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                eVar.f18426e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                eVar = new e(this, cVar);
            }
        }
        Object byId = eVar.f18424c;
        ug.a aVar = ug.a.f29706a;
        int i11 = eVar.f18426e;
        if (i11 == 0) {
            pg.q.b(byId);
            eVar.f18422a = this;
            eVar.f18423b = j10;
            eVar.f18426e = 1;
            byId = this.f18446b.f18583a.getById(j10, eVar);
            if (byId != aVar) {
                gVar = this;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = eVar.f18423b;
            gVar2 = eVar.f18422a;
            pg.q.b(byId);
            gVar = gVar2;
            ah.l.f(gVar.d(j10));
            return pg.f0.f21461a;
        }
        j10 = eVar.f18423b;
        gVar = eVar.f18422a;
        pg.q.b(byId);
        ProjectEntity projectEntity = (ProjectEntity) byId;
        if (projectEntity != null) {
            s sVar = gVar.f18446b;
            eVar.f18422a = gVar;
            eVar.f18423b = j10;
            eVar.f18426e = 2;
            if (sVar.a(projectEntity, eVar) != aVar) {
                gVar2 = gVar;
                gVar = gVar2;
            }
            return aVar;
        }
        ah.l.f(gVar.d(j10));
        return pg.f0.f21461a;
    }

    public final File d(long j10) {
        return new File(this.f18445a.getFilesDir(), m0.r.a("projects/", j10));
    }
}
