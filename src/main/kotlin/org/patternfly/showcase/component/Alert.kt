@file:Suppress("DuplicatedCode")

package org.patternfly.showcase.component

import dev.fritz2.dom.html.RenderContext
import org.patternfly.*
import org.patternfly.Severity.DANGER
import org.patternfly.Severity.DEFAULT
import org.patternfly.Severity.INFO
import org.patternfly.Severity.SUCCESS
import org.patternfly.Severity.WARNING

internal object AlertComponent {
    val content: RenderContext.() -> Unit = {
        intro(
            title = "Alert",
            text = "An alert is used to notify the user about a change in status or other event without blocking other actions in an interface.",
            designGuidelines = "https://www.patternfly.org/v4/components/alert/design-guidelines"
        )
        pageSection {
            snippet("Types", AlertCode.TYPES) {
                alert {
                    severity(DEFAULT)
                    title("Default alert title")
                }
                br {}
                alert {
                    severity(INFO)
                    title("Info alert title")
                }
                br {}
                alert {
                    severity(SUCCESS)
                    title("Success alert title")
                }
                br {}
                alert {
                    severity(WARNING)
                    title("Warning alert title")
                }
                br {}
                alert {
                    severity(DANGER)
                    title("Danger alert title")
                }
            }
            snippet("Variations", AlertCode.VARIATIONS) {
                alert(SUCCESS, "Success alert title", closable = true) {
                    alertDescription {
                        p { +"Success alert description. This should tell the user more information about the alert." }
                    }
                    alertActions {
                        pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                        pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
                    }
                }
                br {}
                alert(SUCCESS, "Success alert title", closable = true) {
                    alertDescription {
                        p {
                            +"Success alert description. This should tell the user more information about the alert. "
                            a {
                                href("#")
                                +"This is a link."
                            }
                        }
                    }
                }
                br {}
                alert(SUCCESS, "Success alert title", closable = true) {
                    alertActions {
                        pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                        pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
                    }
                }
                br {}
                alert(SUCCESS, "Success alert title", closable = true)
                br {}
                alert(SUCCESS, "Success alert title")
            }
            snippet("Inline types", AlertCode.INLINE_TYPES) {
                alert(DEFAULT, "Default inline alert title", inline = true)
                br {}
                alert(INFO, "Info inline alert title", inline = true)
                br {}
                alert(SUCCESS, "Success inline alert title", inline = true)
                br {}
                alert(WARNING, "Warning inline alert title", inline = true)
                br {}
                alert(DANGER, "Danger inline alert title", inline = true)
            }
            snippet("Inline Variations", AlertCode.INLINE_VARIATIONS) {
                alert(SUCCESS, "Success alert title", closable = true, inline = true) {
                    alertDescription {
                        p { +"Success alert description. This should tell the user more information about the alert." }
                    }
                    alertActions {
                        pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                        pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
                    }
                }
                br {}
                alert(SUCCESS, "Success alert title", closable = true, inline = true) {
                    alertDescription {
                        p {
                            +"Success alert description. This should tell the user more information about the alert. "
                            a {
                                href("#")
                                +"This is a link."
                            }
                        }
                    }
                }
                br {}
                alert(SUCCESS, "Success alert title", closable = true, inline = true) {
                    alertActions {
                        pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                        pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
                    }
                }
                br {}
                alert(SUCCESS, "Success alert title", closable = true, inline = true)
                br {}
                alert(SUCCESS, "Success alert title", inline = true)
            }
            snippet("Reactive", AlertCode.REACTIVE) {
                alert {
                    severity(DEFAULT)
                    title("Close me")
                    content { +loremIpsum(3) }
                    closable(true) {
                        clicks handledBy Notification.default("Notification closed")
                    }
                    action("Click me") {
                        clicks handledBy Notification.default("You did it!")
                    }
                }
            }
        }
    }
}

internal object AlertCode {

    //language=kotlin
    const val TYPES: String = """fun main() {
    render {
        alert {
            severity(DEFAULT)
            title("Default alert title")
        }
        br {}
        alert {
            severity(INFO)
            title("Info alert title")
        }
        br {}
        alert {
            severity(SUCCESS)
            title("Success alert title")
        }
        br {}
        alert {
            severity(WARNING)
            title("Warning alert title")
        }
        br {}
        alert {
            severity(DANGER)
            title("Danger alert title")
        }
    }
}
"""

    //language=kotlin
    const val VARIATIONS: String = """fun main() {
    render {
        alert(SUCCESS, "Success alert title", closable = true) {
            alertDescription {
                p { +"Success alert description. This should tell the user more information about the alert." }
            }
            alertActions {
                pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
            }
        }
        br {}
        alert(SUCCESS, "Success alert title", closable = true) {
            alertDescription {
                p {
                    +"Success alert description. This should tell the user more information about the alert. "
                    a {
                        href("#")
                        +"This is a link."
                    }
                }
            }
        }
        br {}
        alert(SUCCESS, "Success alert title", closable = true) {
            alertActions {
                pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
            }
        }
        br {}
        alert(SUCCESS, "Success alert title", closable = true)
        br {}
        alert(SUCCESS, "Success alert title")
    }    
}
"""

    //language=kotlin
    const val INLINE_TYPES: String = """fun main() {
    render {
        alert(DEFAULT, "Default inline alert title", inline = true)
        br {}
        alert(INFO, "Info inline alert title", inline = true)
        br {}
        alert(SUCCESS, "Success inline alert title", inline = true)
        br {}
        alert(WARNING, "Warning inline alert title", inline = true)
        br {}
        alert(DANGER, "Danger inline alert title", inline = true)
    }
}
"""

    //language=kotlin
    const val INLINE_VARIATIONS: String = """fun main() {
    render {
        alert(SUCCESS, "Success alert title", closable = true, inline = true) {
            alertDescription {
                p { +"Success alert description. This should tell the user more information about the alert." }
            }
            alertActions {
                pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
            }
        }
        br {}
        alert(SUCCESS, "Success alert title", closable = true, inline = true) {
            alertDescription {
                p {
                    +"Success alert description. This should tell the user more information about the alert. "
                    a {
                        href("#")
                        +"This is a link."
                    }
                }
            }
        }
        br {}
        alert(SUCCESS, "Success alert title", closable = true, inline = true) {
            alertActions {
                pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                pushButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
            }
        }
        br {}
        alert(SUCCESS, "Success alert title", closable = true, inline = true)
        br {}
        alert(SUCCESS, "Success alert title", inline = true)
    }
}
"""

    //language=kotlin
    const val REACTIVE: String = """fun main() {
    render {
        alert(DEFAULT, "Close me", closable = true) {
            closes handledBy Notification.default("Notification closed")
        }
    }
}
"""
}
