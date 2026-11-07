package y8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.signer.PepkExportHelper;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.io.File;
import x0.n1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.keystore.KeystoreManagerScreenKt$PepkExportDialog$2$1$1$1", f = "KeystoreManagerScreen.kt", l = {660}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f34121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f34122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f34123c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ KeystoreEntity f34125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34126f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n1<String> f34127g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n1<Uri> f34128h;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.keystore.KeystoreManagerScreenKt$PepkExportDialog$2$1$1$1$file$1", f = "KeystoreManagerScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f34129a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ KeystoreEntity f34130b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f34131c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n1<String> f34132d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n1<Uri> f34133e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, KeystoreEntity keystoreEntity, n1<Boolean> n1Var, n1<String> n1Var2, n1<Uri> n1Var3, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f34129a = context;
            this.f34130b = keystoreEntity;
            this.f34131c = n1Var;
            this.f34132d = n1Var2;
            this.f34133e = n1Var3;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f34129a, this.f34130b, this.f34131c, this.f34132d, this.f34133e, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super File> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            boolean zBooleanValue = this.f34131c.getValue().booleanValue();
            KeystoreEntity keystoreEntity = this.f34130b;
            if (zBooleanValue) {
                return PepkExportHelper.INSTANCE.exportWithHexKey(this.f34129a, new File(keystoreEntity.getPath()), keystoreEntity.getPassword(), keystoreEntity.getKeyAlias(), this.f34132d.getValue());
            }
            Uri value = this.f34133e.getValue();
            if (value == null) {
                return null;
            }
            return PepkExportHelper.INSTANCE.exportWithRsaAesPem(this.f34129a, new File(keystoreEntity.getPath()), keystoreEntity.getPassword(), keystoreEntity.getKeyAlias(), value);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(Context context, eh.a<pg.f0> aVar, n1<Boolean> n1Var, KeystoreEntity keystoreEntity, n1<Boolean> n1Var2, n1<String> n1Var3, n1<Uri> n1Var4, tg.e<? super f1> eVar) {
        super(2, eVar);
        this.f34122b = context;
        this.f34123c = aVar;
        this.f34124d = n1Var;
        this.f34125e = keystoreEntity;
        this.f34126f = n1Var2;
        this.f34127g = n1Var3;
        this.f34128h = n1Var4;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new f1(this.f34122b, this.f34123c, this.f34124d, this.f34125e, this.f34126f, this.f34127g, this.f34128h, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((f1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f34121a;
        n1<Boolean> n1Var = this.f34124d;
        if (i10 == 0) {
            pg.q.b(obj);
            n1Var.setValue(Boolean.TRUE);
            wh.c cVar = ph.z0.f21632a;
            wh.b bVar = wh.b.f31563c;
            a aVar2 = new a(this.f34122b, this.f34125e, this.f34126f, this.f34127g, this.f34128h, null);
            this.f34121a = 1;
            obj = ph.h.e(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        File file = (File) obj;
        n1Var.setValue(Boolean.FALSE);
        Context context = this.f34122b;
        if (file != null) {
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("application/zip");
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.addFlags(1);
            context.startActivity(Intent.createChooser(intent, file.getName()));
            Toast.makeText(context, R.string.keystore_pepk_exported, 0).show();
            this.f34123c.invoke();
        } else {
            Toast.makeText(context, R.string.keystore_pepk_failed, 1).show();
        }
        return pg.f0.f21461a;
    }
}
