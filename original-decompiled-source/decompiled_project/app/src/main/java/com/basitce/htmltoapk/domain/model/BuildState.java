package com.basitce.htmltoapk.domain.model;

import i8.n;
import java.io.Serializable;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public abstract class BuildState implements Serializable {
    public static final int $stable = 0;

    public static final class Error extends BuildState {
        public static final int $stable = 0;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message) {
            super(null);
            r.e(message, "message");
            this.message = message;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final Error copy(String message) {
            r.e(message, "message");
            return new Error(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && r.a(this.message, ((Error) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return n.d("Error(message=", this.message, ")");
        }
    }

    public static final class Extracting extends BuildState {
        public static final int $stable = 0;
        public static final Extracting INSTANCE = new Extracting();

        private Extracting() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Extracting);
        }

        public int hashCode() {
            return -363341105;
        }

        public String toString() {
            return "Extracting";
        }
    }

    public static final class Idle extends BuildState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public int hashCode() {
            return -387834526;
        }

        public String toString() {
            return "Idle";
        }
    }

    public static final class InjectingAssets extends BuildState {
        public static final int $stable = 0;
        public static final InjectingAssets INSTANCE = new InjectingAssets();

        private InjectingAssets() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InjectingAssets);
        }

        public int hashCode() {
            return -1813951162;
        }

        public String toString() {
            return "InjectingAssets";
        }
    }

    public static final class ModifyingManifest extends BuildState {
        public static final int $stable = 0;
        public static final ModifyingManifest INSTANCE = new ModifyingManifest();

        private ModifyingManifest() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ModifyingManifest);
        }

        public int hashCode() {
            return -1051201431;
        }

        public String toString() {
            return "ModifyingManifest";
        }
    }

    public static final class Repacking extends BuildState {
        public static final int $stable = 0;
        public static final Repacking INSTANCE = new Repacking();

        private Repacking() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Repacking);
        }

        public int hashCode() {
            return -388570936;
        }

        public String toString() {
            return "Repacking";
        }
    }

    public static final class Signing extends BuildState {
        public static final int $stable = 0;
        public static final Signing INSTANCE = new Signing();

        private Signing() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Signing);
        }

        public int hashCode() {
            return -92334921;
        }

        public String toString() {
            return "Signing";
        }
    }

    public static final class Success extends BuildState {
        public static final int $stable = 0;
        private final String outputPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String outputPath) {
            super(null);
            r.e(outputPath, "outputPath");
            this.outputPath = outputPath;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.outputPath;
            }
            return success.copy(str);
        }

        public final String component1() {
            return this.outputPath;
        }

        public final Success copy(String outputPath) {
            r.e(outputPath, "outputPath");
            return new Success(outputPath);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && r.a(this.outputPath, ((Success) obj).outputPath);
        }

        public final String getOutputPath() {
            return this.outputPath;
        }

        public int hashCode() {
            return this.outputPath.hashCode();
        }

        public String toString() {
            return n.d("Success(outputPath=", this.outputPath, ")");
        }
    }

    public /* synthetic */ BuildState(j jVar) {
        this();
    }

    private BuildState() {
    }
}
