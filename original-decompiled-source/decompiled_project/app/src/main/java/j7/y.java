package j7;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import hi.b0;
import j7.q;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class y {
    /* JADX WARN: Type inference failed for: r4v9, types: [j7.x] */
    public static final ImageDecoder.Source a(q qVar, w7.m mVar, boolean z10) throws ErrnoException {
        b0 b0VarJ0;
        if (qVar.getFileSystem() == hi.n.f13098a && (b0VarJ0 = qVar.j0()) != null) {
            return ImageDecoder.createSource(b0VarJ0.toFile());
        }
        q.a aVarC = qVar.c();
        if (aVarC instanceof a) {
            return ImageDecoder.createSource(mVar.f31401a.getAssets(), ((a) aVarC).f15204a);
        }
        if ((aVarC instanceof e) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptor = ((e) aVarC).f15219a;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: j7.x
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return assetFileDescriptor;
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (aVarC instanceof s) {
            s sVar = (s) aVarC;
            if (kotlin.jvm.internal.r.a(sVar.f15242a, mVar.f31401a.getPackageName())) {
                return ImageDecoder.createSource(mVar.f31401a.getResources(), sVar.f15243b);
            }
        }
        if (!(aVarC instanceof d)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z10 || ((d) aVarC).f15218a.isDirect()) {
            return ImageDecoder.createSource(((d) aVarC).f15218a);
        }
        return null;
    }
}
