package f8;

import androidx.room.g0;
import androidx.room.x;
import com.basitce.htmltoapk.data.local.AppDatabase;
import com.basitce.htmltoapk.data.local.AppDatabaseMigrations;
import com.basitce.htmltoapk.data.local.dao.FolderDao;
import com.basitce.htmltoapk.data.local.dao.KeystoreDao;
import com.basitce.htmltoapk.data.local.dao.ProjectDao;
import e9.x0;
import n8.m1;

/* loaded from: classes.dex */
public final class e extends l {

    /* renamed from: a, reason: collision with root package name */
    public final kg.a f8878a;

    /* renamed from: b, reason: collision with root package name */
    public final e f8879b = this;

    /* renamed from: c, reason: collision with root package name */
    public final ng.c<m1> f8880c = ng.a.a(new a(this, 0));

    /* renamed from: d, reason: collision with root package name */
    public final ng.c<i8.j> f8881d = ng.a.a(new a(this, 1));

    /* renamed from: e, reason: collision with root package name */
    public final ng.c<g8.p> f8882e = ng.a.a(new a(this, 3));

    /* renamed from: f, reason: collision with root package name */
    public final ng.c<j8.a> f8883f = ng.a.a(new a(this, 2));

    /* renamed from: g, reason: collision with root package name */
    public final ng.c<h8.f> f8884g = ng.a.a(new a(this, 5));

    /* renamed from: h, reason: collision with root package name */
    public final ng.c<AppDatabase> f8885h = ng.a.a(new a(this, 8));

    /* renamed from: i, reason: collision with root package name */
    public final ng.c<n8.s> f8886i = ng.a.a(new a(this, 7));

    /* renamed from: j, reason: collision with root package name */
    public final ng.c<n8.i> f8887j = ng.a.a(new a(this, 9));

    /* renamed from: k, reason: collision with root package name */
    public final ng.c<h8.m> f8888k = ng.a.a(new a(this, 6));

    /* renamed from: l, reason: collision with root package name */
    public final ng.c<h8.a> f8889l = ng.a.a(new a(this, 4));

    /* renamed from: m, reason: collision with root package name */
    public final ng.c<n8.g> f8890m = ng.a.a(new a(this, 10));

    /* renamed from: n, reason: collision with root package name */
    public final ng.c<n8.l> f8891n = ng.a.a(new a(this, 11));

    /* renamed from: o, reason: collision with root package name */
    public final ng.c<k8.h> f8892o = ng.a.a(new a(this, 12));

    public static final class a<T> implements ng.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final e f8893a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8894b;

        public a(e eVar, int i10) {
            this.f8893a = eVar;
            this.f8894b = i10;
        }

        @Override // og.a
        public final T get() {
            e eVar = this.f8893a;
            int i10 = this.f8894b;
            switch (i10) {
                case 0:
                    return (T) new m1(eVar.f8878a.f16306a);
                case 1:
                    return (T) new i8.j(eVar.f8878a.f16306a, eVar.f8880c.get());
                case 2:
                    return (T) new j8.a(eVar.f8881d.get(), eVar.f8882e.get());
                case 3:
                    return (T) new g8.p(eVar.f8878a.f16306a);
                case 4:
                    return (T) new h8.a(eVar.f8878a.f16306a, eVar.f8884g.get(), eVar.f8888k.get(), eVar.f8882e.get());
                case 5:
                    return (T) new h8.f(eVar.f8882e.get());
                case 6:
                    return (T) new h8.m(eVar.f8878a.f16306a, eVar.f8886i.get(), eVar.f8887j.get());
                case 7:
                    AppDatabase database = eVar.f8885h.get();
                    kotlin.jvm.internal.r.e(database, "database");
                    ProjectDao projectDao = database.projectDao();
                    x0.a(projectDao);
                    return (T) new n8.s(projectDao);
                case 8:
                    g0.a aVarA = x.a(eVar.f8878a.f16306a, AppDatabase.class, "html_to_apk.db");
                    AppDatabaseMigrations appDatabaseMigrations = AppDatabaseMigrations.INSTANCE;
                    aVarA.a(appDatabaseMigrations.getMIGRATION_7_8(), appDatabaseMigrations.getMIGRATION_8_9(), appDatabaseMigrations.getMIGRATION_9_10(), appDatabaseMigrations.getMIGRATION_10_11(), appDatabaseMigrations.getMIGRATION_11_12(), appDatabaseMigrations.getMIGRATION_12_13(), appDatabaseMigrations.getMIGRATION_13_14(), appDatabaseMigrations.getMIGRATION_14_15(), appDatabaseMigrations.getMIGRATION_15_16(), appDatabaseMigrations.getMIGRATION_16_17(), appDatabaseMigrations.getMIGRATION_17_18(), appDatabaseMigrations.getMIGRATION_18_19(), appDatabaseMigrations.getMIGRATION_19_20(), appDatabaseMigrations.getMIGRATION_20_21());
                    return (T) ((AppDatabase) aVarA.b());
                case 9:
                    AppDatabase database2 = eVar.f8885h.get();
                    kotlin.jvm.internal.r.e(database2, "database");
                    FolderDao folderDao = database2.folderDao();
                    x0.a(folderDao);
                    AppDatabase database3 = eVar.f8885h.get();
                    kotlin.jvm.internal.r.e(database3, "database");
                    ProjectDao projectDao2 = database3.projectDao();
                    x0.a(projectDao2);
                    return (T) new n8.i(folderDao, projectDao2);
                case 10:
                    return (T) new n8.g(eVar.f8878a.f16306a, eVar.f8886i.get());
                case 11:
                    AppDatabase database4 = eVar.f8885h.get();
                    kotlin.jvm.internal.r.e(database4, "database");
                    KeystoreDao keystoreDao = database4.keystoreDao();
                    x0.a(keystoreDao);
                    return (T) new n8.l(keystoreDao, eVar.f8878a.f16306a);
                case 12:
                    return (T) new k8.h(eVar.f8878a.f16306a, eVar.f8881d.get());
                default:
                    throw new AssertionError(i10);
            }
        }
    }

    public e(kg.a aVar) {
        this.f8878a = aVar;
    }

    @Override // jg.c.a
    public final c a() {
        return new c(this.f8879b);
    }
}
