package l7;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import g7.h0;
import g7.i0;
import g7.t;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.jvm.internal.r;
import l7.k;
import qg.x;
import x7.a;

/* loaded from: classes.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f16746a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.m f16747b;

    public static final class a implements k.a<h0> {
        @Override // l7.k.a
        public final k a(Object obj, w7.m mVar, t tVar) {
            h0 h0Var = (h0) obj;
            if (r.a(h0Var.f11506c, "content")) {
                return new g(h0Var, mVar);
            }
            return null;
        }
    }

    public g(h0 h0Var, w7.m mVar) {
        this.f16746a = h0Var;
        this.f16747b = mVar;
    }

    @Override // l7.k
    public final Object a(tg.e<? super j> eVar) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listD;
        int size;
        h0 h0Var = this.f16746a;
        Uri uri = Uri.parse(h0Var.f11504a);
        w7.m mVar = this.f16747b;
        ContentResolver contentResolver = mVar.f31401a.getContentResolver();
        String str = h0Var.f11507d;
        if (r.a(str, "com.android.contacts") && r.a(x.K(i0.d(h0Var)), "display_photo")) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && r.a(str, "media") && (size = (listD = i0.d(h0Var)).size()) >= 3 && r.a(listD.get(size - 3), "audio") && r.a(listD.get(size - 2), "albums")) {
            x7.h hVar = mVar.f31402b;
            x7.a aVar = hVar.f32199a;
            Bundle bundle = null;
            a.C0326a c0326a = aVar instanceof a.C0326a ? (a.C0326a) aVar : null;
            if (c0326a != null) {
                int i10 = c0326a.f32183a;
                x7.a aVar2 = hVar.f32200b;
                a.C0326a c0326a2 = aVar2 instanceof a.C0326a ? (a.C0326a) aVar2 : null;
                if (c0326a2 != null) {
                    int i11 = c0326a2.f32183a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i10, i11));
                }
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
            }
        }
        return new p(new j7.t(hi.x.b(hi.x.h(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), mVar.f31406f, new j7.e(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), j7.f.f15222c);
    }
}
