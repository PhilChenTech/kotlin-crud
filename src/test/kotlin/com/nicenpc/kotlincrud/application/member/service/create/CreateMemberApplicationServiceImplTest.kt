import com.nicenpc.kotlincrud.application.member.service.create.CreateMemberApplicationServiceImpl
import com.nicenpc.kotlincrud.application.member.service.create.CreateMemberCommand
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CreateMemberApplicationServiceImplTest {

    @Test
    fun execute_createsMemberWithValidCommand() {
        val createMemberCommand = CreateMemberCommand(name = "John Doe", age = 30)
        val service = CreateMemberApplicationServiceImpl()

        assertDoesNotThrow { service.execute(createMemberCommand) }
    }

    @Test
    fun execute_throwsExceptionWhenNameIsEmpty() {
        val createMemberCommand = CreateMemberCommand(name = "", age = 30)
        val service = CreateMemberApplicationServiceImpl()

        val exception = assertThrows<IllegalArgumentException> {
            service.execute(createMemberCommand)
        }
        assertEquals("Name cannot be empty", exception.message)
    }

    @Test
    fun execute_throwsExceptionWhenAgeIsNegative() {
        val createMemberCommand = CreateMemberCommand(name = "John Doe", age = -1)
        val service = CreateMemberApplicationServiceImpl()

        val exception = assertThrows<IllegalArgumentException> {
            service.execute(createMemberCommand)
        }
        assertEquals("Age cannot be negative", exception.message)
    }
}