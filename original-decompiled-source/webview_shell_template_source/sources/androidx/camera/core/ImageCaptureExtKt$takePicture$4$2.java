package androidx.camera.core;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ImageCaptureExtKt$takePicture$4$2 extends kotlin.jvm.internal.k implements p5.l<Throwable, d5.j> {
    final /* synthetic */ kotlin.jvm.internal.p<DelegatingImageSavedCallback> $delegatingCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCaptureExtKt$takePicture$4$2(kotlin.jvm.internal.p<DelegatingImageSavedCallback> pVar) {
        super(1);
        this.$delegatingCallback = pVar;
    }

    @Override // p5.l
    public /* bridge */ /* synthetic */ d5.j invoke(Throwable th) {
        invoke2(th);
        return d5.j.f12745a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        DelegatingImageSavedCallback delegatingImageSavedCallback = this.$delegatingCallback.s;
        if (delegatingImageSavedCallback != null) {
            delegatingImageSavedCallback.dispose();
        } else {
            kotlin.jvm.internal.j.g("delegatingCallback");
            throw null;
        }
    }
}
