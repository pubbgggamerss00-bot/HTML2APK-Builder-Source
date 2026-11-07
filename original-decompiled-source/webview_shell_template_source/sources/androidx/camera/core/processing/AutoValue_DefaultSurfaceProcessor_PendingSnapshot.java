package androidx.camera.core.processing;

import androidx.camera.core.processing.DefaultSurfaceProcessor;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class AutoValue_DefaultSurfaceProcessor_PendingSnapshot extends DefaultSurfaceProcessor.PendingSnapshot {
    private final b.a<Void> completer;
    private final int jpegQuality;
    private final int rotationDegrees;

    public AutoValue_DefaultSurfaceProcessor_PendingSnapshot(int i6, int i7, b.a<Void> aVar) {
        this.jpegQuality = i6;
        this.rotationDegrees = i7;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.completer = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DefaultSurfaceProcessor.PendingSnapshot) {
            DefaultSurfaceProcessor.PendingSnapshot pendingSnapshot = (DefaultSurfaceProcessor.PendingSnapshot) obj;
            if (this.jpegQuality == pendingSnapshot.getJpegQuality() && this.rotationDegrees == pendingSnapshot.getRotationDegrees() && this.completer.equals(pendingSnapshot.getCompleter())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    public b.a<Void> getCompleter() {
        return this.completer;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        return ((((this.jpegQuality ^ 1000003) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.completer.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.jpegQuality + ", rotationDegrees=" + this.rotationDegrees + ", completer=" + this.completer + "}";
    }
}
