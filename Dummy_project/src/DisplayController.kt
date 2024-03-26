import com.outleap.scholar.shared.core.ApiVersion
import com.outleap.scholar.shared.getPreUserId
import com.outleap.scholar.shared.logger
import com.outleap.scholar.shared.prettyStackTrace
import com.outleap.scholar.testPrep.*
import com.outleap.scholar.testPrep.facade.SubmissionFacade
import com.outleap.scholar.testPrep.repository.ExamCategoryMapRepository
import com.outleap.scholar.user.facade.ValidationException
import com.outleap.scholar.utils.ResponseWrapper
import com.outleap.security.DeveloperAPI
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("test-prep")
class DisplayController {
}