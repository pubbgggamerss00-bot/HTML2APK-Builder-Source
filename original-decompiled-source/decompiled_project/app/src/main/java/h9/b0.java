package h9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreStorage;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$exportP12$2", f = "KeystoreViewModel.kt", l = {186}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12525a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f12527c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ KeystoreEntity f12528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y8.b1 f12529e;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$exportP12$2$1", f = "KeystoreViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y8.b1 f12530a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Serializable f12531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y8.b1 b1Var, Serializable serializable, tg.e eVar) {
            super(2, eVar);
            this.f12530a = b1Var;
            this.f12531b = serializable;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f12530a, this.f12531b, eVar);
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
            y8.b1 b1Var = this.f12530a;
            c.k kVar = b1Var.f34072a;
            Context context = b1Var.f34073b;
            Serializable serializable = this.f12531b;
            Throwable thA = pg.p.a(serializable);
            if (thA == null) {
                pg.n nVar = (pg.n) serializable;
                Uri uri = (Uri) nVar.f21469a;
                String str = (String) nVar.f21470b;
                hf.a.a(kVar, context, Intent.createChooser(x.f(uri, str, "application/pkcs12"), str), R.string.launch_no_app);
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
    public b0(Context context, KeystoreEntity keystoreEntity, y8.b1 b1Var, tg.e eVar) {
        super(2, eVar);
        this.f12527c = context;
        this.f12528d = keystoreEntity;
        this.f12529e = b1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        b0 b0Var = new b0(this.f12527c, this.f12528d, this.f12529e, eVar);
        b0Var.f12526b = obj;
        return b0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((b0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Serializable serializableA;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12525a;
        if (i10 == 0) {
            pg.q.b(obj);
            Context context = this.f12527c;
            KeystoreEntity keystoreEntity = this.f12528d;
            try {
                File file = new File(context.getCacheDir(), "keystore_exports");
                file.mkdirs();
                String input = keystoreEntity.getAlias();
                Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9_-]");
                kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                kotlin.jvm.internal.r.e(input, "input");
                String strReplaceAll = patternCompile.matcher(input).replaceAll("_");
                kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
                File file2 = new File(file, strReplaceAll.concat(KeystoreStorage.FILE_EXTENSION));
                FileInputStream fileInputStream = new FileInputStream(new File(keystoreEntity.getPath()));
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        ah.b.a(fileInputStream, fileOutputStream, 8192);
                        fileOutputStream.close();
                        fileInputStream.close();
                        serializableA = new pg.n(FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file2), strReplaceAll.concat(KeystoreStorage.FILE_EXTENSION));
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                serializableA = pg.q.a(th2);
            }
            wh.c cVar = ph.z0.f21632a;
            qh.g gVar = uh.o.f29764a;
            a aVar2 = new a(this.f12529e, serializableA, null);
            this.f12525a = 1;
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
