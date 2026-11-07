package h9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreHelper;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.io.File;
import java.io.Serializable;
import java.util.regex.Pattern;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$exportPem$2", f = "KeystoreViewModel.kt", l = {209}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12563a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f12565c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ KeystoreEntity f12566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f12567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y8.v0 f12568f;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$exportPem$2$1", f = "KeystoreViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y8.v0 f12569a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Serializable f12570b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y8.v0 v0Var, Serializable serializable, tg.e eVar) {
            super(2, eVar);
            this.f12569a = v0Var;
            this.f12570b = serializable;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f12569a, this.f12570b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            y8.v0 v0Var = this.f12569a;
            c.k kVar = v0Var.f34278a;
            Context context = v0Var.f34279b;
            Serializable serializable = this.f12570b;
            Throwable thA = pg.p.a(serializable);
            if (thA == null) {
                pg.n nVar = (pg.n) serializable;
                Uri uri = (Uri) nVar.f21469a;
                String str = (String) nVar.f21470b;
                hf.a.a(kVar, context, Intent.createChooser(x.f(uri, str, "application/x-pem-file"), str), R.string.launch_no_app);
            } else {
                String message = thA.getMessage();
                if (message == null) {
                    message = context.getString(R.string.keystore_operation_failed);
                    kotlin.jvm.internal.r.d(message, "getString(...)");
                }
                Toast.makeText(context, message, 0).show();
            }
            pg.f0 f0Var = pg.f0.f21461a;
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(x xVar, KeystoreEntity keystoreEntity, Context context, y8.v0 v0Var, tg.e eVar) {
        super(2, eVar);
        this.f12565c = xVar;
        this.f12566d = keystoreEntity;
        this.f12567e = context;
        this.f12568f = v0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        c0 c0Var = new c0(this.f12565c, this.f12566d, this.f12567e, this.f12568f, eVar);
        c0Var.f12564b = obj;
        return c0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((c0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Serializable serializableA;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12563a;
        if (i10 == 0) {
            pg.q.b(obj);
            x xVar = this.f12565c;
            KeystoreEntity keystore = this.f12566d;
            Context context = this.f12567e;
            try {
                xVar.f12857b.getClass();
                kotlin.jvm.internal.r.e(keystore, "keystore");
                String strExportCertificateAsPem = KeystoreHelper.INSTANCE.exportCertificateAsPem(new File(keystore.getPath()), keystore.getPassword(), keystore.getKeyAlias());
                File file = new File(context.getCacheDir(), "keystore_exports");
                file.mkdirs();
                String input = keystore.getAlias();
                Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9_-]");
                kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                kotlin.jvm.internal.r.e(input, "input");
                String strReplaceAll = patternCompile.matcher(input).replaceAll("_");
                kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
                File file2 = new File(file, strReplaceAll.concat(".pem"));
                ah.l.r(file2, strExportCertificateAsPem, mh.a.f18238b);
                serializableA = new pg.n(FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file2), strReplaceAll.concat(".pem"));
            } catch (Throwable th2) {
                serializableA = pg.q.a(th2);
            }
            wh.c cVar = ph.z0.f21632a;
            qh.g gVar = uh.o.f29764a;
            a aVar2 = new a(this.f12568f, serializableA, null);
            this.f12563a = 1;
            if (ph.h.e(gVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
