package f9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import java.util.ArrayList;
import kotlinx.serialization.internal.GeneratedSerializer;

/* loaded from: classes.dex */
public final /* synthetic */ class vf implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10818b;

    public /* synthetic */ vf(Object obj, int i10) {
        this.f10817a = i10;
        this.f10818b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        ArrayList arrayList;
        zh.b<?>[] bVarArrTypeParametersSerializers;
        switch (this.f10817a) {
            case 0:
                ((x0.n1) this.f10818b).setValue(Boolean.FALSE);
                break;
            case 1:
                GeneratedSerializer<?> generatedSerializer = ((kotlinx.serialization.internal.n0) this.f10818b).f16389b;
                if (generatedSerializer == null || (bVarArrTypeParametersSerializers = generatedSerializer.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(bVarArrTypeParametersSerializers.length);
                    for (zh.b<?> bVar : bVarArrTypeParametersSerializers) {
                        arrayList.add(bVar.getDescriptor());
                    }
                }
                break;
            case 2:
                Context context = (Context) this.f10818b;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://android.gadgethacks.com/news/google-android-sideloading-restrictions-sept-30-explained/"));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                } catch (Exception unused) {
                    Toast.makeText(context, "https://android.gadgethacks.com/news/google-android-sideloading-restrictions-sept-30-explained/", 1).show();
                }
                break;
            default:
                s8.b2.e((p5.x) this.f10818b);
                break;
        }
        return pg.f0.f21461a;
    }
}
