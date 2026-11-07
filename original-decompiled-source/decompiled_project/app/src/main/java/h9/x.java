package h9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreHelper;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreStorage;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class x extends androidx.lifecycle.w0 {

    /* renamed from: b, reason: collision with root package name */
    public final n8.l f12857b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.s f12858c;

    /* renamed from: d, reason: collision with root package name */
    public final sh.l0 f12859d;

    /* renamed from: e, reason: collision with root package name */
    public final sh.l0 f12860e;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$1", f = "KeystoreViewModel.kt", l = {39}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f12861a;

        public a(tg.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return x.this.new a(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = ug.a.f29706a;
            int i10 = this.f12861a;
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    x xVar = x.this;
                    n8.l lVar = xVar.f12857b;
                    n8.s sVar = xVar.f12858c;
                    this.f12861a = 1;
                    lVar.getClass();
                    wh.c cVar = ph.z0.f21632a;
                    Object objE = ph.h.e(wh.b.f31563c, new n8.q(lVar, sVar, null), this);
                    if (objE != obj2) {
                        objE = pg.f0.f21461a;
                    }
                    if (objE == obj2) {
                        return obj2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
            } catch (Exception unused) {
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$importKeystore$2", f = "KeystoreViewModel.kt", l = {126, 129}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f12863a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f12864b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f12865c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f12866d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x f12867e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f12868f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f12869g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f12870h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ eh.l<pg.p<pg.f0>, pg.f0> f12871j;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$importKeystore$2$1", f = "KeystoreViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ eh.l<pg.p<pg.f0>, pg.f0> f12872a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f12873b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(eh.l<? super pg.p<pg.f0>, pg.f0> lVar, Object obj, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f12872a = lVar;
                this.f12873b = obj;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new a(this.f12872a, this.f12873b, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                this.f12872a.invoke(new pg.p<>(this.f12873b));
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Context context, Uri uri, x xVar, String str, String str2, String str3, eh.l<? super pg.p<pg.f0>, pg.f0> lVar, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f12865c = context;
            this.f12866d = uri;
            this.f12867e = xVar;
            this.f12868f = str;
            this.f12869g = str2;
            this.f12870h = str3;
            this.f12871j = lVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            b bVar = new b(this.f12865c, this.f12866d, this.f12867e, this.f12868f, this.f12869g, this.f12870h, this.f12871j, eVar);
            bVar.f12864b = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
        
            if (ph.h.e(r3, r4, r23) == r2) goto L45;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objA;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f12863a;
            try {
            } catch (Throwable th2) {
                objA = pg.q.a(th2);
            }
            if (i10 == 0) {
                pg.q.b(obj);
                Context context = this.f12865c;
                Uri uri = this.f12866d;
                n8.l lVar = this.f12867e.f12857b;
                String password = this.f12868f;
                String alias = this.f12869g;
                String keyPassword = this.f12870h;
                File file = new File(context.getFilesDir(), "keystores");
                file.mkdirs();
                File file2 = new File(file, "imported_" + System.currentTimeMillis() + KeystoreStorage.FILE_EXTENSION);
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    throw new IllegalStateException("Failed to open input stream");
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        ah.b.a(inputStreamOpenInputStream, fileOutputStream, 8192);
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                        lVar.getClass();
                        kotlin.jvm.internal.r.e(password, "password");
                        kotlin.jvm.internal.r.e(alias, "alias");
                        kotlin.jvm.internal.r.e(keyPassword, "keyPassword");
                        if (!KeystoreHelper.INSTANCE.verifyKeystore(file2, password, alias, keyPassword)) {
                            file2.delete();
                            throw new IllegalArgumentException("Keystore verification failed. Check password and alias.");
                        }
                        String absolutePath = file2.getAbsolutePath();
                        kotlin.jvm.internal.r.d(absolutePath, "getAbsolutePath(...)");
                        KeystoreEntity keystoreEntity = new KeystoreEntity(0L, alias, absolutePath, password, alias, "RSA", false, null, keyPassword, 0L, 705, null);
                        this.f12863a = 1;
                        if (lVar.f(keystoreEntity, this) == aVar) {
                            return aVar;
                        }
                    } finally {
                    }
                } finally {
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    return pg.f0.f21461a;
                }
                pg.q.b(obj);
            }
            objA = pg.f0.f21461a;
            wh.c cVar = ph.z0.f21632a;
            qh.g gVar = uh.o.f29764a;
            a aVar2 = new a(this.f12871j, objA, null);
            this.f12863a = 2;
        }
    }

    public x(n8.l keystoreRepository, n8.s projectRepository) {
        kotlin.jvm.internal.r.e(keystoreRepository, "keystoreRepository");
        kotlin.jvm.internal.r.e(projectRepository, "projectRepository");
        this.f12857b = keystoreRepository;
        this.f12858c = projectRepository;
        sh.f<List<KeystoreEntity>> fVarE = keystoreRepository.e();
        l5.a aVarA = androidx.lifecycle.x0.a(this);
        sh.x0 x0VarA = sh.u0.a(2);
        qg.z zVar = qg.z.f22752a;
        this.f12859d = gg.a.i(fVarE, aVarA, x0VarA, zVar);
        this.f12860e = gg.a.i(projectRepository.f18583a.getAll(), androidx.lifecycle.x0.a(this), sh.u0.a(2), zVar);
        ph.h.c(androidx.lifecycle.x0.a(this), wh.b.f31563c, null, new a(null), 2);
    }

    public static Intent f(Uri uri, String displayName, String str) {
        kotlin.jvm.internal.r.e(uri, "uri");
        kotlin.jvm.internal.r.e(displayName, "displayName");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(str);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.putExtra("android.intent.extra.TITLE", displayName);
        intent.addFlags(1);
        return intent;
    }

    public final void g(Context context, Uri uri, String alias, String password, String keyPassword, eh.l<? super pg.p<pg.f0>, pg.f0> lVar) {
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(uri, "uri");
        kotlin.jvm.internal.r.e(alias, "alias");
        kotlin.jvm.internal.r.e(password, "password");
        kotlin.jvm.internal.r.e(keyPassword, "keyPassword");
        l5.a aVarA = androidx.lifecycle.x0.a(this);
        wh.c cVar = ph.z0.f21632a;
        ph.h.c(aVarA, wh.b.f31563c, null, new b(context, uri, this, password, alias, keyPassword, lVar, null), 2);
    }
}
